package com.hotelize.repository;

import com.hotelize.domain.Auth;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AuthRepository extends MongoRepository<Auth, String> {
}
