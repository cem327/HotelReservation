package com.hotelize.service;

import com.hotelize.domain.Features;
import com.hotelize.repository.FeaturesRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class FeaturesService extends ServiceManager<Features, String> {
    private final FeaturesRepository featuresRepository;
    Hotel_FeaturesService hotel_featuresService;

    public FeaturesService(FeaturesRepository featuresRepository) {
        super(featuresRepository);
        this.featuresRepository = featuresRepository;
    }
}
