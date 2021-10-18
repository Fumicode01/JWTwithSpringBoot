package com.example.jwtwithspringboot;

import com.example.jwtwithspringboot.domain.Role;
import com.example.jwtwithspringboot.domain.User;
import com.example.jwtwithspringboot.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class JwtwithspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtwithspringbootApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args ->{
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "John Travolta", "john","1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Will Smith", "Will","1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Thomas bike", "Thomas","1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Kerry Terner", "Kerry","1234", new ArrayList<>()));


			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("will", "ROLE_MANAGER");
			userService.addRoleToUser("Thomas", "ROLE_ADMIN");
			userService.addRoleToUser("Kerry", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Kerry", "ROLE_ADMIN");
			userService.addRoleToUser("Kerry", "ROLE_USER");




		};
	}
}
