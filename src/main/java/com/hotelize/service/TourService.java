package com.hotelize.service;

import com.hotelize.domain.Tour;
import com.hotelize.repository.TourRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class TourService extends ServiceManager<Tour, String> {

    private final TourRepository tourRepository;

    public TourService(TourRepository tourRepository) {
        super(tourRepository);
        this.tourRepository = tourRepository;
    }
}
