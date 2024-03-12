package com.hotelize.controller;

import com.hotelize.dto.request.AuthRegisterRequestDto;
import com.hotelize.dto.response.AuthRegisterResponseDto;
import com.hotelize.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.AUTH;

@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;


    @GetMapping(REGISTER)
    public ResponseEntity<AuthRegisterResponseDto> register(AuthRegisterRequestDto request) {return authService.register(request);
    }
}
