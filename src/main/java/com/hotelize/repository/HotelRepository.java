package com.hotelize.repository;

import com.hotelize.domain.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HotelRepository extends MongoRepository<Hotel, String> {

//    List<Hotel> findTop10();
}
