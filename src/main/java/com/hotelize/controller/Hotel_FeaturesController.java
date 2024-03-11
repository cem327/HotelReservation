package com.hotelize.controller;

import com.hotelize.service.Hotel_FeaturesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.HOTEL_FEATURES;

@RestController
@RequestMapping(HOTEL_FEATURES)
@RequiredArgsConstructor
public class Hotel_FeaturesController {
    private final Hotel_FeaturesService hotel_FeaturesService;
}
