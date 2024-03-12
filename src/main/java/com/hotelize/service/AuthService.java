package com.hotelize.service;

import com.hotelize.domain.Auth;
import com.hotelize.repository.AuthRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AuthService extends ServiceManager<Auth, String> {
    private final AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        super(authRepository);
        this.authRepository = authRepository;
    }
}
