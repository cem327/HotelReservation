package com.hotelize.service;

import com.hotelize.domain.Hotel;
import com.hotelize.domain.UserProfile;
import com.hotelize.dto.request.CreateUserRequestDto;
import com.hotelize.dto.request.UserProfileUpdateRequestDto;
import com.hotelize.dto.response.CreateUserResponseDto;
import com.hotelize.exception.user_profile_service_exception.ErrorType;
import com.hotelize.exception.user_profile_service_exception.UserProfileServiceException;
import com.hotelize.mapper.UserProfileMapper;
import com.hotelize.repository.UserProfileRepository;
import com.hotelize.utils.JwtTokenManager;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService extends ServiceManager<UserProfile, String> {

    private final UserProfileRepository userProfileRepository;
    AuthService authService;
    private final JwtTokenManager jwtTokenManager;

    public UserProfileService(UserProfileRepository userProfileRepository,JwtTokenManager jwtTokenManager) {
        super(userProfileRepository);
        this.userProfileRepository = userProfileRepository;
        this.jwtTokenManager = jwtTokenManager;
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

    public UserProfile findUserByToken(String token) {
        return userProfileRepository
                .findByAuthId(jwtTokenManager.getIdFromToken(token)
                        .orElseThrow(() -> new UserProfileServiceException(ErrorType.ERROR_FIND_ID_BY_TOKEN)));
    }
    public UserProfile update(UserProfileUpdateRequestDto dto) {
        UserProfile userProfile =userProfileRepository
                .findByAuthId(jwtTokenManager.getIdFromToken(dto.getToken())
                        .orElseThrow(() -> new UserProfileServiceException(ErrorType.ERROR_FIND_ID_BY_TOKEN)));

        userProfile.setName(dto.getNewName()); // yeni verilen isim set ediliyor.
        userProfile.setSurname(dto.getNewSurname()); // yeni verilen soyisim set ediliyor.
        userProfile.setAddress(dto.getNewAddress()); // yeni verilen adres set ediliyor.
        return userProfileRepository.save(userProfile);
    }

    public List<Hotel> getFavourite() {
        return null; // TODO BURADA KALINDI . FAVORI OTELLER EKLENMESI GEREKIYOR. TBL COMMENTTEN ILERLENEBILIR.
    }
}
