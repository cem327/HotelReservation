package com.hotelize.controller;

import com.hotelize.service.HotelActivitiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.HOTEL_ACTIVITIES;

@RestController
@RequestMapping(HOTEL_ACTIVITIES)
@RequiredArgsConstructor
public class HotelActivitiesController {
    private final HotelActivitiesService hotelActivitiesService;
}
