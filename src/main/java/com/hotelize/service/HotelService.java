package com.hotelize.service;

import com.hotelize.domain.*;
import com.hotelize.dto.request.HotelAddRequestDto;
import com.hotelize.dto.response.HotelAddResponseDto;
import com.hotelize.mapper.HotelMapper;
import com.hotelize.repository.HotelRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService extends ServiceManager<Hotel,String> {

    private final HotelRepository hotelRepository;
    Hotel_TagsService hotelTagsService;
    Hotel_TourService hotelTourService;
    Hotel_FeaturesService hotelFeaturesService;
    HotelPromotionService hotelPromotionService;


    public HotelService(HotelRepository hotelRepository) {
        super(hotelRepository);
        this.hotelRepository = hotelRepository;
    }
    public List<Hotel> findAll(){
        return hotelRepository.findAll();
    }

    public HotelAddResponseDto add(HotelAddRequestDto dto) {
        Hotel hotel = HotelMapper.INSTANCE.fromHotelAddRequestDtoToHotel(dto);
        hotelRepository.save(hotel);

        hotelTagsService.save(Hotel_Tags.builder().hotelId(hotel.getId()).build());
        hotelPromotionService.save(HotelPromotion.builder().hotelId(hotel.getId()).build());
        hotelFeaturesService.save(Hotel_Features.builder().hotelId(hotel.getId()).build());
        hotelTourService.save(Hotel_Tour.builder().hotelId(hotel.getId()).build());

        return HotelMapper.INSTANCE.fromHotelToHotelAddResponseDto(hotel);
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
        List<Hotel> hotelList = hotelRepository.findAllByNameContainingIgnoreCaseOrLocationContainingIgnoreCase(name,location);
        return hotelList;


    }
}
