package com.hotelize.controller;

import com.hotelize.service.FeaturesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.FEATURES;

@RestController
@RequestMapping(FEATURES)
@RequiredArgsConstructor
public class FeaturesController {
    private final FeaturesService featuresService;
}
