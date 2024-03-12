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
@Document(collection = "tbl_tour") //tbl_tur
public class Tour implements Serializable {
    @Id
    private String id;
    private String name;
    private Boolean isActive;

}
