package com.example.api.error;

import com.example.api.base.Error;
import org.springframework.http.HttpStatus;

public class GetCarsServiceError implements Error {
    @Override
    public HttpStatus getCode() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @Override
    public String getMessage() {
        return "Get Cars Service is unavailable!!!";
    }
}
