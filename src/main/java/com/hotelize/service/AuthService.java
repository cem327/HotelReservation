package com.hotelize.service;

import com.hotelize.domain.Auth;
import com.hotelize.dto.request.AuthRegisterRequestDto;
import com.hotelize.dto.response.AuthRegisterResponseDto;
import com.hotelize.repository.AuthRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService extends ServiceManager<Auth, String> {
    private final AuthRepository authRepository;

    public AuthService(AuthRepository authRepository, UserProfileService userProfileService) {
        super(authRepository);

        this.authRepository = authRepository;
    }

    public ResponseEntity<AuthRegisterResponseDto> register(AuthRegisterRequestDto request) {
        Auth auth = Auth.builder()
                .userName(request.getUserName())
                .password(request.getPassword())
                .email(request.getEmail())
                .isActive(true)
                .build();
        authRepository.save(auth);
        AuthRegisterResponseDto response = AuthRegisterResponseDto.builder()
                .userName(request.getUserName())
                .email(request.getEmail())
                .build();
        return ResponseEntity.ok(response);
    }
}
