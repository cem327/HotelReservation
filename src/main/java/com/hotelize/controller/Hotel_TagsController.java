package com.hotelize.controller;

import com.hotelize.service.Hotel_TagsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.HOTEL_TAGS;

@RestController
@RequestMapping(HOTEL_TAGS)
@RequiredArgsConstructor
public class Hotel_TagsController {
    private final Hotel_TagsService hotel_TagsService;
}
