package com.hotelize.repository;

import com.hotelize.domain.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile, String> {

    UserProfile findByAuthId(String authId);
}
