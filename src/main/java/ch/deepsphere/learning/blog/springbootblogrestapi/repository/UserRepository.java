package ch.deepsphere.learning.blog.springbootblogrestapi.repository;

import ch.deepsphere.learning.blog.springbootblogrestapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Generating Query Methods by Naming Standard

    // Using JPA Standard Naming Convention to create the Query by JPA
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    Optional<User> findByUsername(String username);

    // Checks if user with username exists
    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
