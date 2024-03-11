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
@Document(collection = "tbl_user_profile") // tbl_user_profile
public class UserProfile implements Serializable {
    @Id
    private String id;
    private String authId; // auth id referansi
    private String name;
    private String surname;
    private String address;

}
