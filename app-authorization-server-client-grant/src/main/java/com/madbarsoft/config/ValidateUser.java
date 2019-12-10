package com.madbarsoft.config;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidateUser {

	// This method will be used to check if the user has a valid token to access
	// the resource

	@RequestMapping("/validateUser")
	public Principal user(Principal user) {
		return user;
	}

}
