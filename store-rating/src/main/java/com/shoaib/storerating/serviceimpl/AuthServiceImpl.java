package com.shoaib.storerating.serviceimpl;

import com.shoaib.storerating.dto.AuthResponse;
import com.shoaib.storerating.dto.LoginRequest;
import com.shoaib.storerating.dto.RegisterRequest;
import com.shoaib.storerating.entity.Role;
import com.shoaib.storerating.entity.User;
import com.shoaib.storerating.repository.UserRepository;
import com.shoaib.storerating.security.JwtService;
import com.shoaib.storerating.service.AuthService;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

	private final UserRepository userRepository;

	private final PasswordEncoder passwordEncoder;

	private final JwtService jwtService;

	private final AuthenticationManager authenticationManager;

	// Constructor Injection
	public AuthServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService,
			AuthenticationManager authenticationManager) {

		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtService = jwtService;
		this.authenticationManager = authenticationManager;
	}

	@Override
	public String register(RegisterRequest request) {

		User user = new User();

		user.setName(request.getName());

		user.setEmail(request.getEmail());

		user.setPassword(passwordEncoder.encode(request.getPassword()));

		user.setAddress(request.getAddress());

		user.setRole(Role.USER);

		userRepository.save(user);

		return "User Registered Successfully";
	}

	@Override
	public AuthResponse login(LoginRequest request) {

		System.out.println("LOGIN API CALLED");

		System.out.println(request.getEmail());

		System.out.println(request.getPassword());

		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));

		String token = jwtService.generateToken(request.getEmail());

		return new AuthResponse(token);
	}
}