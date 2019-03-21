package hu.codecool.advanced.tipszmiksz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    @Column(unique = true)
    private String email;

    public User(RegisterForm registerForm) {
        this.name = registerForm.getName();
        this.email = registerForm.getEmail();
        this.password = registerForm.getPassword();
    }
}
