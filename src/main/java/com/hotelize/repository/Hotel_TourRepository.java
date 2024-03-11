package com.hotelize.repository;

import com.hotelize.domain.Hotel_Tour;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Hotel_TourRepository extends MongoRepository<Hotel_Tour, String> {
}
