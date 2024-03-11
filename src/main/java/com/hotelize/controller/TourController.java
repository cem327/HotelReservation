package com.hotelize.controller;

import com.hotelize.service.TourService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;

@RestController
@RequestMapping(TOUR)
@RequiredArgsConstructor
public class TourController {
    private final TourService tourService;
}
