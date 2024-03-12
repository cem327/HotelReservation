package com.hotelize.service;

import com.hotelize.domain.UserProfile;
import com.hotelize.dto.request.CreateUserRequestDto;
import com.hotelize.dto.response.CreateUserResponseDto;
import com.hotelize.mapper.UserProfileMapper;
import com.hotelize.repository.UserProfileRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserProfileService extends ServiceManager<UserProfile, String> {

    private final UserProfileRepository userProfileRepository;
    private final AuthService authService;

    public UserProfileService(UserProfileRepository userProfileRepository,AuthService authService) {
        super(userProfileRepository);
        this.userProfileRepository = userProfileRepository;
        this.authService = authService;
    }



    public CreateUserResponseDto createUserProfile(CreateUserRequestDto dto){

        authService.findById(dto.getAuthId()).orElseThrow()


        UserProfile userProfile = UserProfileMapper.INSTANCE.fromCreateRequestToUserProfile(dto);
        save(userProfile);

        return UserProfileMapper.INSTANCE.fromUserProfileToCreateResponseDto(userProfile);
    }


}
