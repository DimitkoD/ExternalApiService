package com.example.rest.controller;

import com.example.api.base.Error;
import com.example.api.model.GetCarsRequest;
import com.example.api.model.GetCarsResponse;

import com.example.api.operation.GetCarsProcessor;
import io.vavr.control.Either;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
    private final GetCarsProcessor getCarsProcessor;

    public ApiController(GetCarsProcessor getCarsProcessor) {
        this.getCarsProcessor = getCarsProcessor;
    }

    @PostMapping("/getCars")
    public ResponseEntity<?> getCars(@RequestBody GetCarsRequest getCarsRequest) {
        Either<Error, GetCarsResponse> result = getCarsProcessor.process(getCarsRequest);
        if(result.isLeft()){
            return ResponseEntity
                    .status(result.getLeft().getCode())
                    .body(result.getLeft().getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body(result.get());
    }
}
