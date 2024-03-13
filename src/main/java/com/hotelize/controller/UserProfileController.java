package com.hotelize.controller;

import com.hotelize.domain.UserProfile;
import com.hotelize.dto.request.CreateUserRequestDto;
import com.hotelize.dto.response.CreateUserResponseDto;
import com.hotelize.service.UserProfileService;
import com.hotelize.utils.JwtTokenManager;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.hotelize.constants.RestApiUrls.USERPROFILE;
import static com.hotelize.constants.RestApiUrls.*;


@RestController
@RequestMapping(USERPROFILE)
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileService userProfileService;
    private final JwtTokenManager tokenManager;

    @PostMapping(CREATE)
    public ResponseEntity<CreateUserResponseDto> createUserProfile(@RequestBody @Valid CreateUserRequestDto dto){
        return ResponseEntity.ok(userProfileService.createUserProfile(dto));

    }

    @PostMapping(FIND_ALL)
    public ResponseEntity<List<UserProfile>> findAll(){
        return ResponseEntity.ok(userProfileService.findAll());
    }

    @PostMapping(FIND_BY_ID)
    public ResponseEntity<UserProfile> findById(String id){
        return ResponseEntity.ok(userProfileService.findUserById(id));
    }

    @GetMapping("/get-id-from-token")
    public ResponseEntity<String> getIdFromToken(String token){
        return ResponseEntity.ok(tokenManager.getIdFromToken(token).get());
    }


}
