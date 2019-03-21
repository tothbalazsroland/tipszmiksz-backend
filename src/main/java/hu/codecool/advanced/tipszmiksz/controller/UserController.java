package hu.codecool.advanced.tipszmiksz.controller;

import hu.codecool.advanced.tipszmiksz.customExceptions.EmailAlreadyExistException;
import hu.codecool.advanced.tipszmiksz.model.RegisterForm;
import hu.codecool.advanced.tipszmiksz.model.User;
import hu.codecool.advanced.tipszmiksz.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/register")
    public User registration(@RequestBody RegisterForm registerForm){
        log.info("Trying to register new user with email:{}", registerForm.getEmail());
        User user = userRepository.getUserByEmail(registerForm.getEmail());

        if (user == null){
            registerForm.setPassword(bCryptPasswordEncoder.encode(registerForm.getPassword()));
            User newUser = new User(registerForm);
            userRepository.save(newUser);
            log.info("User successfully created and saved!");
            return newUser;
        }else {
            throw new EmailAlreadyExistException("Email already exists!");
        }
    }

    }
