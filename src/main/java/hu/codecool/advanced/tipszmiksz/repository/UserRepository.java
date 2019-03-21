package hu.codecool.advanced.tipszmiksz.repository;

import hu.codecool.advanced.tipszmiksz.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<User,Long> {

}
