package com.hotelize.exception.auth_exception;

import com.hotelize.exception.ErrorType;
import lombok.Getter;


@Getter
public class AuthManagerException extends RuntimeException{

    private final AuthErrorType errorType;

    public AuthManagerException(AuthErrorType errorType, String customMessage){
        super(customMessage);
        this.errorType = errorType;
    }
    public AuthManagerException(AuthErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }


}