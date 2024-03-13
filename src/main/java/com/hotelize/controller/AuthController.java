package com.hotelize.controller;

import com.hotelize.dto.request.AuthRegisterRequestDto;
import com.hotelize.dto.request.LoginRequestDto;
import com.hotelize.dto.response.AuthRegisterResponseDto;
import com.hotelize.service.AuthService;
import com.hotelize.utils.JwtTokenManager;
import com.hotelize.utils.enums.ERole;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.AUTH;

@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final JwtTokenManager tokenManager;


    @GetMapping(REGISTER)
    public ResponseEntity<AuthRegisterResponseDto> register(AuthRegisterRequestDto request) {return authService.register(request);
    }

    @PostMapping(LOGIN)
    public ResponseEntity<String> login(@RequestBody LoginRequestDto dto){
        return ResponseEntity.ok(authService.login(dto));
    }

    @GetMapping("/create-token")
    public ResponseEntity<String> createToken(String id, ERole role){
        return ResponseEntity.ok(tokenManager.createToken(id,role).get());
    }







}
