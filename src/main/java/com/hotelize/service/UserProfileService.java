package com.hotelize.service;

import com.hotelize.domain.UserProfile;
import com.hotelize.dto.request.CreateUserRequestDto;
import com.hotelize.dto.response.CreateUserResponseDto;
import com.hotelize.exception.user_profile_service_exception.ErrorType;
import com.hotelize.exception.user_profile_service_exception.UserProfileServiceException;
import com.hotelize.mapper.UserProfileMapper;
import com.hotelize.repository.UserProfileRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, String> {

    private final UserProfileRepository userProfileRepository;
    AuthService authService;

    public UserProfileService(UserProfileRepository userProfileRepository) {
        super(userProfileRepository);
        this.userProfileRepository = userProfileRepository;
    }



    public CreateUserResponseDto createUserProfile(CreateUserRequestDto dto){

//        authService.findById(dto.getAuthId()).orElseThrow(() -> new AuthServiceException(ErrorType.ERROR_INVALID_LOGIN_PARAMETER));


        UserProfile userProfile = UserProfileMapper.INSTANCE.fromCreateRequestToUserProfile(dto);
        save(userProfile);

        return UserProfileMapper.INSTANCE.fromUserProfileToCreateResponseDto(userProfile);
    }

    public UserProfile findUserById(String id){
        return userProfileRepository.findById(id).orElseThrow(() -> new UserProfileServiceException(ErrorType.ERROR_USER_NOT_FOUND));
    }

}
