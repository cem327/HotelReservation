package com.hotelize.repository;

import com.hotelize.domain.Hotel_Features;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Hotel_FeaturesRepository extends MongoRepository<Hotel_Features, String> {
}
