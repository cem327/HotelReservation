package com.hotelize.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "tbl_hotel")
public class Hotel implements Serializable {
    @Id
    private String id;
    private String name;
    private String location;
    private Double longitude;
    private Double latitude;
    private Integer totalPoint;
    private String checkInTime;
    private String checkOutTime;
    private String description;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Document("tbl_image")
    public static class Images{
        @Id
        private String id;
        private String url;
        private String hotelId; // otel referansi
        private ImageCategory imageCategory;
        @CreatedDate
        private LocalDateTime createdAt;
        @LastModifiedDate
        private LocalDateTime updatedAt;
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        @Document("tbl_image_category")
        public static class ImageCategory{
            @Id
            private String id;
            private String name;
            @CreatedDate
            private LocalDateTime createdAt;
            @LastModifiedDate
            private LocalDateTime updatedAt;
        }
    }

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;

}
