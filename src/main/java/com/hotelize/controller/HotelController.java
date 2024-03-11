package com.hotelize.controller;

import com.hotelize.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.HOTEL;

@RestController
@RequestMapping(HOTEL)
@RequiredArgsConstructor
public class HotelController {
    private final HotelService hotelService;
}
