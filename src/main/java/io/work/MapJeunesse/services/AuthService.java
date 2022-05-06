package io.work.MapJeunesse.services;

import io.work.MapJeunesse.security.request.LoginRequest;
import io.work.MapJeunesse.security.request.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> authenticateUser(LoginRequest loginRequest);
    ResponseEntity<?> registerUser(SignupRequest signupRequest);
}
