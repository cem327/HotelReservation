package com.hotelize.mapper;

import com.hotelize.domain.Hotel;
import com.hotelize.dto.request.HotelAddRequestDto;
import com.hotelize.dto.response.HotelAddResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-14T01:02:22+0300",
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

        HotelAddResponseDto.HotelAddResponseDtoBuilder hotelAddResponseDto = HotelAddResponseDto.builder();

        hotelAddResponseDto.name( dto.getName() );
        hotelAddResponseDto.location( dto.getLocation() );
        hotelAddResponseDto.longitude( dto.getLongitude() );
        hotelAddResponseDto.latitude( dto.getLatitude() );
        hotelAddResponseDto.totalPoint( dto.getTotalPoint() );
        hotelAddResponseDto.checkInTime( dto.getCheckInTime() );
        hotelAddResponseDto.checkOutTime( dto.getCheckOutTime() );
        hotelAddResponseDto.description( dto.getDescription() );

        return hotelAddResponseDto.build();
    }

    @Override
    public HotelAddResponseDto fromHotelToHotelAddResponseDto(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        HotelAddResponseDto.HotelAddResponseDtoBuilder hotelAddResponseDto = HotelAddResponseDto.builder();

        hotelAddResponseDto.name( hotel.getName() );
        hotelAddResponseDto.location( hotel.getLocation() );
        hotelAddResponseDto.longitude( hotel.getLongitude() );
        hotelAddResponseDto.latitude( hotel.getLatitude() );
        hotelAddResponseDto.totalPoint( hotel.getTotalPoint() );
        hotelAddResponseDto.checkInTime( hotel.getCheckInTime() );
        hotelAddResponseDto.checkOutTime( hotel.getCheckOutTime() );
        hotelAddResponseDto.description( hotel.getDescription() );

        return hotelAddResponseDto.build();
    }
}
