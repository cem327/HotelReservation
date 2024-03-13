package com.hotelize.repository;

import com.hotelize.domain.Hotel;
import com.hotelize.domain.Location;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;
import java.util.Optional;

public interface HotelRepository extends MongoRepository<Hotel, String>, QuerydslPredicateExecutor<Hotel> {

//    List<Hotel> findTop10();
    List<Hotel> findAllByIdIn(List<String> ids);

    Optional<Hotel> findOptionalById(String id);


}
