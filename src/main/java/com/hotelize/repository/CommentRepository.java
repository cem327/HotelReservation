package com.hotelize.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import javax.xml.stream.events.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
