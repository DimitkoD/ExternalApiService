package com.example.domain.service;


import com.example.api.model.GetCarsRequest;
import com.example.api.model.GetCarsResponse;

public interface GetCarsService {
    GetCarsResponse getCars(GetCarsRequest getCarsRequest);
}
