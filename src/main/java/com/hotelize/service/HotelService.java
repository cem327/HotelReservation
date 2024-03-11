package com.hotelize.service;

import com.hotelize.domain.Hotel;
import com.hotelize.repository.HotelRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class HotelService extends ServiceManager<Hotel,String> {

    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        super(hotelRepository);
        this.hotelRepository = hotelRepository;
    }
}
