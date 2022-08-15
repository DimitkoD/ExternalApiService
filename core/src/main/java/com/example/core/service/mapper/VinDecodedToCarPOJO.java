package com.example.core.service.mapper;


import com.example.api.operation2.CarEntity;
import com.example.api.operation2.CarPOJO;
import com.example.domain.externalmodel.VinDecoded;

public interface VinDecodedToCarPOJO {
    CarPOJO mapToCarPojo(VinDecoded vidDecoded, CarEntity carEntity);
}
