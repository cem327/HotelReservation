package com.hotelize.service;

import com.hotelize.domain.Hotel_Tour;
import com.hotelize.repository.Hotel_TourRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class Hotel_TourService extends ServiceManager<Hotel_Tour, String> {
    private final Hotel_TourRepository hotelTourRepository;
    public Hotel_TourService(Hotel_TourRepository hotelTourRepository) {
        super(hotelTourRepository);
        this.hotelTourRepository = hotelTourRepository;
    }
}
