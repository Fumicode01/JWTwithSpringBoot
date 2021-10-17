package com.example.jwtwithspringboot.repo;

import com.example.jwtwithspringboot.domain.Role;
import com.example.jwtwithspringboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    User findByName(String name);
}
