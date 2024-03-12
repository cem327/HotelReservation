package com.hotelize.service;

import com.hotelize.domain.Hotel_Tags;
import com.hotelize.repository.Hotel_TagsRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class Hotel_TagsService extends ServiceManager<Hotel_Tags, String> {

    private final Hotel_TagsRepository hotelTagsRepository;

    public Hotel_TagsService(Hotel_TagsRepository hotelTagsRepository) {
        super(hotelTagsRepository);
        this.hotelTagsRepository = hotelTagsRepository;
    }
}