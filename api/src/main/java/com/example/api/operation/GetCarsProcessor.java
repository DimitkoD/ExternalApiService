package com.example.api.operation;

import com.example.api.base.Error;
import com.example.api.base.OperationProcessor;
import com.example.api.model.GetCarsRequest;
import com.example.api.model.GetCarsResponse;
import io.vavr.control.Either;

public interface GetCarsProcessor extends OperationProcessor<GetCarsRequest, GetCarsResponse> {
    Either<Error, GetCarsResponse> process(GetCarsRequest getCarsRequest);
}
