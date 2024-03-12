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
@Document(collection = "tbl_hotel_tags") //tbl_otel_tags Cross Table
public class Hotel_Tags implements Serializable {
    @Id
    private String id;
    private String otelId; // otel id referansi
    private String tagId; // tag id referansi
}
