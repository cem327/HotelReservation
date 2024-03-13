package com.hotelize.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelAddResponseDto {

    private String name;
    private String location;
    private Double longitude;
    private Double latitude;
    private Integer totalPoint;
    private String checkInTime;
    private String checkOutTime;
    private String description;
}
