package com.example.jwtwithspringboot.service;

import com.example.jwtwithspringboot.domain.Role;
import com.example.jwtwithspringboot.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();




}
