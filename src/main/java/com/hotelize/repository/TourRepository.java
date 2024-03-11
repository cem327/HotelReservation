package com.hotelize.repository;

import com.hotelize.domain.Tour;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TourRepository extends MongoRepository<Tour, String> {
}
