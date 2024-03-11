package com.hotelize.controller;

import com.hotelize.service.TagsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.TAGS;

@RestController
@RequestMapping(TAGS)
@RequiredArgsConstructor
public class TagsController {
    private final TagsService tagsService;
}
