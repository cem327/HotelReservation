package com.hotelize.controller;

import com.hotelize.domain.Hotel;
import com.hotelize.domain.UserProfile;
import com.hotelize.dto.request.CreateUserRequestDto;
import com.hotelize.dto.request.UserProfileUpdateRequestDto;
import com.hotelize.dto.response.CreateUserResponseDto;
import com.hotelize.service.UserProfileService;
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

    @PostMapping(CREATE)
    public ResponseEntity<CreateUserResponseDto> createUserProfile(@RequestBody @Valid CreateUserRequestDto dto){
        return ResponseEntity.ok(userProfileService.createUserProfile(dto));

    }

    @PostMapping(FIND_ALL)
    public ResponseEntity<List<UserProfile>> findAll(){
        return ResponseEntity.ok(userProfileService.findAll());
    }

    @PostMapping(FIND_BY_ID)
    public ResponseEntity<UserProfile> findById(@RequestParam String id){
        return ResponseEntity.ok(userProfileService.findUserById(id));
    }

    @PostMapping(FIND_BY_TOKEN)
    public ResponseEntity<UserProfile> findByToken(@RequestParam String token){
        return ResponseEntity.ok(userProfileService.findUserByToken(token));
    }

    @PostMapping(UPDATE)
    public ResponseEntity<UserProfile> update(@RequestBody UserProfileUpdateRequestDto dto){
        return ResponseEntity.ok(userProfileService.update(dto));
    }

    @GetMapping(FAVOURITE)
    public ResponseEntity<List<Hotel>> getFavourite(){
        return ResponseEntity.ok(userProfileService.getFavourite());
    }
}
