package com.hotelize.service;

import com.hotelize.domain.Hotel;
import com.hotelize.dto.request.HotelAddRequestDto;
import com.hotelize.dto.response.HotelAddResponseDto;
import com.hotelize.repository.HotelRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService extends ServiceManager<Hotel,String> {

    private final HotelRepository hotelRepository;


    public HotelService(HotelRepository hotelRepository) {
        super(hotelRepository);
        this.hotelRepository = hotelRepository;
    }
    public List<Hotel> findAll(){
        return hotelRepository.findAll();
    }

    public HotelAddResponseDto add(HotelAddRequestDto dto) {

        return null;
    }

    public List<Hotel> findAllHotelByIdIn(List<String> ids){
        return hotelRepository.findAllByIdIn(ids);
    }
    public Boolean existsById(String id){
        return hotelRepository.existsById(id);
    }

    public Hotel findHotelById(String id){
        Optional<Hotel> hotel = hotelRepository.findOptionalById(id);

        if (hotel.isPresent()) {
            return hotel.get();
        }else {
            throw new NullPointerException("Hotel not found");

        }
    }


    public List<Hotel> searchHotels(String name, String location){
        return hotelRepository.findAllByNameContainingIgnoreCaseOrLocationContainingIgnoreCase(name,location);
    }
}
