package com.hotelize.controller;

import com.hotelize.service.HotelPromotionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.HOTELPROMOTION;

@RestController
@RequestMapping(HOTELPROMOTION)
@RequiredArgsConstructor
public class HotelPromotionController {
    private final HotelPromotionService hotelPromotionService;
}
