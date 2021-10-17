package com.example.jwtwithspringboot.repo;

import com.example.jwtwithspringboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
