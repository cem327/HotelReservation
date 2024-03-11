package com.hotelize.domain;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "tbl_hotel_activites") // tbl_tesis_olanak
public class HotelActivities implements Serializable {
    @Id
    private String id;

    private String otelId; // otel id referansi
    private String title; //genelBaslik
    private String description; //detayAciklama

}
