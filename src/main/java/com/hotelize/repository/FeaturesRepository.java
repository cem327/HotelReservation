package com.hotelize.repository;

import com.hotelize.domain.Features;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeaturesRepository extends MongoRepository<Features, String> {
}
