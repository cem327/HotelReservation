package com.hotelize.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "tbl_hotel_features") // tbl_otel_ozellik cross table
public class Hotel_Features implements Serializable {
    @Id
    private String id;
    private String hotelId; // hotel id referansi
    private String featuresId; // feature id referansi
}
