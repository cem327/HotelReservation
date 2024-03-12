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
@Document(collection = "tbl_hotel_tour") // tbl_otel_tur
public class Hotel_Tour implements Serializable {
    @Id
    private String id;
    private String tourId; // tour referansi
    private String otelId; // otel referansi
}
