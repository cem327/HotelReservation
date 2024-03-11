package com.hotelize.controller;

import com.hotelize.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hotelize.constants.RestApiUrls.USERPROFILE;
import static com.hotelize.constants.RestApiUrls.*;


@RestController
@RequestMapping(USERPROFILE)
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileService userService;
}
