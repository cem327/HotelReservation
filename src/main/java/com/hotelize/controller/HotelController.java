package com.hotelize.controller;

import com.hotelize.domain.Hotel;
import com.hotelize.dto.request.HotelAddRequestDto;
import com.hotelize.dto.response.HotelAddResponseDto;
import com.hotelize.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(FIND_BY_ID)
    public ResponseEntity<Hotel> findById(String id){
        return ResponseEntity.ok(hotelService.findHotelById(id));
    }

    @GetMapping(HOTEL_FIND_SEARCH)
    public ResponseEntity<List<Hotel>> searchHotels(@RequestParam String name, String location){
        List<Hotel> hotels = hotelService.searchHotels(name,location);


        return ResponseEntity.ok(hotels);
    }
}
