package com.hotelize.mapper;

import com.hotelize.domain.Hotel;
import com.hotelize.dto.request.HotelAddRequestDto;
import com.hotelize.dto.response.HotelAddResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-12T15:39:08+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
@Component
public class HotelMapperImpl implements HotelMapper {

    @Override
    public Hotel fromHotelAddRequestDtoToHotel(HotelAddRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Hotel.HotelBuilder hotel = Hotel.builder();

        return hotel.build();
    }

    @Override
    public HotelAddResponseDto HotelToHotelAddResponseDto(HotelAddResponseDto dto) {
        if ( dto == null ) {
            return null;
        }

        HotelAddResponseDto hotelAddResponseDto = new HotelAddResponseDto();

        return hotelAddResponseDto;
    }
}
