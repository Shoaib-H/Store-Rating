package com.shoaib.storerating.controller;

import com.shoaib.storerating.dto.AuthResponse;
import com.shoaib.storerating.dto.LoginRequest;
import com.shoaib.storerating.dto.RegisterRequest;
import com.shoaib.storerating.service.AuthService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

	private final AuthService authService;

	// Constructor Injection
	public AuthController(AuthService authService) {

		this.authService = authService;
	}

	@PostMapping("/register")
	public String register(@RequestBody RegisterRequest request) {

		return authService.register(request);
	}

	@PostMapping("/login")
	public AuthResponse login(@RequestBody LoginRequest request) {

		return authService.login(request);
	}
}