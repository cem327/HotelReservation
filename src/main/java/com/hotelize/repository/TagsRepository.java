package com.hotelize.repository;

import com.hotelize.domain.Tags;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TagsRepository extends MongoRepository<Tags, String> {
}
