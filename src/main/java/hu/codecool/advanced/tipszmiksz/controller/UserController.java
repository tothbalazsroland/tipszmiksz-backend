package hu.codecool.advanced.tipszmiksz.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import hu.codecool.advanced.tipszmiksz.customExceptions.EmailAlreadyExistException;
import hu.codecool.advanced.tipszmiksz.model.LoginForm;
import hu.codecool.advanced.tipszmiksz.model.RegisterForm;
import hu.codecool.advanced.tipszmiksz.model.User;
import hu.codecool.advanced.tipszmiksz.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static hu.codecool.advanced.tipszmiksz.security.SecurityConstants.EXPIRATION_TIME;
import static hu.codecool.advanced.tipszmiksz.security.SecurityConstants.SECRET;

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
            log.info("User successfully created and saved with email: {}, name: {}!", newUser.getEmail(),newUser.getName());
            return newUser;
        }else {
            throw new EmailAlreadyExistException("Email already exists!");
        }
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginForm loginForm){
        log.info("Login attempt with email: {}", loginForm.getEmail());
        User user = userRepository.getUserByEmail(loginForm.getEmail());
        if (user == null){
            log.info("No user registered on this email: {}", loginForm.getEmail());
            return "Invalid username or password!";
        }else {
            if (bCryptPasswordEncoder.matches(loginForm.getPassword(), user.getPassword())){
                log.info("Successful login with email: {}", user.getEmail());
                String jwtToken = JWT.create()
                        .withSubject(user.getName())
                        .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                        .sign(Algorithm.HMAC512(SECRET.getBytes()));
                return jwtToken;
            }
            log.warn("Password does not match!");
            return "Invalid username or password!";
        }
    }


    }
