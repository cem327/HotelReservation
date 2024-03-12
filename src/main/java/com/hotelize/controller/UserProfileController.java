package com.hotelize.controller;

import com.hotelize.domain.UserProfile;
import com.hotelize.dto.request.CreateUserRequestDto;
import com.hotelize.dto.response.CreateUserResponseDto;
import com.hotelize.service.UserProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.USERPROFILE;
import static com.hotelize.constants.RestApiUrls.*;


@RestController
@RequestMapping(USERPROFILE)
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping(CREATE)
    public ResponseEntity<CreateUserResponseDto> createUserProfile(@RequestBody @Valid CreateUserRequestDto dto){
        return ResponseEntity.ok(userProfileService.createUserProfile(dto));

    }

}
