package com.hotelize.exception.auth_exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum AuthErrorType {

    INTERNAL_SERVER_ERROR(5100, "Sunucu Hatasi",HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST (4100,"Parametre hatasi", HttpStatus.BAD_REQUEST),
    LOGIN_ERROR(4110,"Kullanici adi veya sifre hatalidir...",HttpStatus.BAD_REQUEST),
    USERNAME_DUPLICATE(4111,"B�yle bir kullanici adi sistemde mevcut...", HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(4112,"B�yle bir kullanici bulunamadi...",HttpStatus.BAD_REQUEST),
    ACTIVATION_CODE_ERROR(4113,"Aktivasyon kod hatasi..." ,HttpStatus.BAD_REQUEST ),
    INVALID_TOKEN(4114,"Ge�ersiz token" ,HttpStatus.BAD_REQUEST),
    TOKEN_NOT_CREATED(4115,"Token olusturulamadi..." , HttpStatus.BAD_REQUEST ),
    ACCOUNT_NOT_ACTIVE(4116,"Hesabiniz aktif degildir..." , HttpStatus.FORBIDDEN ),
    ROLE_NOT_FOUND(4117,"ROL BULUNAMADI" ,HttpStatus.BAD_REQUEST),
    USER_NOT_CREATED(4118,"Kullanici profili olusturulamadi...",HttpStatus.BAD_REQUEST);


    private int code;
    private String message;
    private HttpStatus httpStatus;
}
