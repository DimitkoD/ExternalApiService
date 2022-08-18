package com.example.domain.service.mapper;


import com.example.api.model.CarApiEntity;
import com.example.api.model.CarPOJO;
import com.example.domain.externalmodel.VinDecoded;

public interface VinDecodedToCarPOJO {
    CarPOJO mapToCarPojo(VinDecoded vidDecoded, CarApiEntity carApiEntity);
}
