package com.bhavy.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.authentication.UserServiceBeanDefinitionParser;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@SpringBootApplication
public class BhavyBankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BhavyBankAppApplication.class, args);
	}

}
