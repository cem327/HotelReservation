package com.hotelize.service;

import com.hotelize.domain.Hotel_Features;
import com.hotelize.repository.Hotel_FeaturesRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class Hotel_FeaturesService extends ServiceManager<Hotel_Features, String> {

    private final Hotel_FeaturesRepository hotelFeaturesRepository;

    public Hotel_FeaturesService(Hotel_FeaturesRepository hotelFeaturesRepository) {
        super(hotelFeaturesRepository);
        this.hotelFeaturesRepository = hotelFeaturesRepository;
    }
}
