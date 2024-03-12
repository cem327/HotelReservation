package com.hotelize.service;

import com.hotelize.domain.UserProfile;
import com.hotelize.repository.UserProfileRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, String> {
    private final UserProfileRepository userProfileRepository;


    public UserProfileService(MongoRepository<UserProfile, String> repository, UserProfileService userProfileRepository) {
        super(repository);
        this.userProfileRepository = userProfileRepository;
    }
}
