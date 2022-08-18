package com.example.core.processor;

import com.example.api.base.Error;
import com.example.api.error.GetCarsServiceError;
import com.example.api.model.GetCarsRequest;
import com.example.api.model.GetCarsResponse;
import com.example.api.operation.GetCarsProcessor;
import com.example.domain.service.GetCarsService;
import io.vavr.control.Either;
import io.vavr.control.Try;
import org.springframework.stereotype.Service;

@Service
public class GetCarsProcessorCore implements GetCarsProcessor {
    private final GetCarsService getCarsService;

    public GetCarsProcessorCore(GetCarsService getCarsService) {
        this.getCarsService = getCarsService;
    }

    @Override
    public Either<Error, GetCarsResponse> process(GetCarsRequest getCarsRequest) {
        return Try.of(() -> {
                    return getCarsService.getCars(getCarsRequest);
                })
                .toEither()
                .mapLeft(throwable -> {
                    return new GetCarsServiceError();
                });
    }
}
