package com.cdac.ridesharingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cdac.ridesharingapplication.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);
    Boolean existsByMobile(String mobile);
}