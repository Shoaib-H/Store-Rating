package com.shoaib.storerating.service;

import com.shoaib.storerating.dto.*;

public interface AuthService {

	String register(RegisterRequest request);

	AuthResponse login(LoginRequest request);
}