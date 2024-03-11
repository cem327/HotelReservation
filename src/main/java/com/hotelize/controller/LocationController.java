package com.hotelize.controller;

import com.hotelize.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.LOCATION;

@RestController
@RequestMapping(LOCATION)
@RequiredArgsConstructor
public class LocationController {
    private final LocationService locationService;
}
