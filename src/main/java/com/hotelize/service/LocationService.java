package com.hotelize.service;

import com.hotelize.domain.Location;
import com.hotelize.repository.LocationRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class LocationService extends ServiceManager<Location, String> {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        super(locationRepository);
        this.locationRepository = locationRepository;
    }
}
