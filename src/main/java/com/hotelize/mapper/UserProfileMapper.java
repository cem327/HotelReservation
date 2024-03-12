package com.hotelize.mapper;

import com.hotelize.dto.request.CreateUserRequestDto;
import com.hotelize.domain.UserProfile;
import com.hotelize.dto.request.CreateUserRequestDto;
import com.hotelize.dto.response.CreateUserResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserProfileMapper {

    UserProfileMapper INSTANCE = Mappers.getMapper(UserProfileMapper.class);

    UserProfile fromCreateRequestToUserProfile(final CreateUserRequestDto dto);
    CreateUserResponseDto fromUserProfileToCreateResponseDto(final UserProfile userProfile);

//    @Mapping(source = "id" , target = "authId")
    UserProfile fromAuthToCreateUserRequestDto(final CreateUserRequestDto dto);



//    @Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//    public interface UserMapper {
//
//        UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
//
//        User fromCreateRequestToUser(final CreateUserRequestDto dto);
//
//
//
//
//    }
}
