package com.hotelize.repository;

import com.hotelize.domain.Hotel_Tags;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Hotel_TagsRepository extends MongoRepository<Hotel_Tags, String> {
}
