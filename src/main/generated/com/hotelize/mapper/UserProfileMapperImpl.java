package com.hotelize.mapper;

import com.hotelize.domain.UserProfile;
import com.hotelize.dto.request.CreateUserRequestDto;
import com.hotelize.dto.response.CreateUserResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-12T15:23:15+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
@Component
public class UserProfileMapperImpl implements UserProfileMapper {

    @Override
    public UserProfile fromCreateRequestToUserProfile(CreateUserRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserProfile.UserProfileBuilder userProfile = UserProfile.builder();

        userProfile.authId( dto.getAuthId() );
        userProfile.name( dto.getName() );
        userProfile.surname( dto.getSurname() );
        userProfile.address( dto.getAddress() );

        return userProfile.build();
    }

    @Override
    public CreateUserResponseDto fromUserProfileToCreateResponseDto(UserProfile userProfile) {
        if ( userProfile == null ) {
            return null;
        }

        CreateUserResponseDto.CreateUserResponseDtoBuilder createUserResponseDto = CreateUserResponseDto.builder();

        createUserResponseDto.name( userProfile.getName() );
        createUserResponseDto.surname( userProfile.getSurname() );

        return createUserResponseDto.build();
    }
}
