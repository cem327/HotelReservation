package com.hotelize.controller;

import com.hotelize.service.Hotel_TourService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.HOTEL_TOUR;

@RestController
@RequestMapping(HOTEL_TOUR)
@RequiredArgsConstructor
public class Hotel_TourController {
    private final Hotel_TourService hotel_TourService;
}
