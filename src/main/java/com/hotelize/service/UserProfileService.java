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

    public UserProfileService(UserProfileRepository userProfileRepository) {
        super(userProfileRepository);
        this.userProfileRepository = userProfileRepository;
    }


    @Transactional
    public CreateUserResponseDto createUserProfile(CreateUserRequestDto dto){

        UserProfile userProfile = UserProfileMapper.INSTANCE.fromCreateRequestToUserProfile(dto);
        save(userProfile);

        return UserProfileMapper.INSTANCE.fromUserProfileToCreateResponseDto(userProfile);

    }
}
