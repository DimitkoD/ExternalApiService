package com.example.core.service.mapper;


import com.example.api.operationApi.CarApiEntity;
import com.example.api.operationApi.CarPOJO;
import com.example.domain.externalmodel.VinDecoded;

public interface VinDecodedToCarPOJO {
    CarPOJO mapToCarPojo(VinDecoded vidDecoded, CarApiEntity carApiEntity);
}
