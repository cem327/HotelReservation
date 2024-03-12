package com.hotelize.controller;

import com.hotelize.domain.Hotel;
import com.hotelize.dto.request.HotelAddRequestDto;
import com.hotelize.dto.response.HotelAddResponseDto;
import com.hotelize.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.hotelize.constants.RestApiUrls.*;
import static com.hotelize.constants.RestApiUrls.HOTEL;

@RestController
@RequestMapping(HOTEL)
@RequiredArgsConstructor
public class HotelController {
    private final HotelService hotelService;

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Hotel>> findAll(){
        return ResponseEntity.ok(hotelService.findAll());
    }

    @GetMapping(ADD)
    public ResponseEntity<HotelAddResponseDto> add(HotelAddRequestDto dto){
        return ResponseEntity.ok(hotelService.add(dto));
    }
}
