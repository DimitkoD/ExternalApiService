package com.example.core.service.mapper;

import com.example.api.operationApi.CarApiEntity;
import com.example.api.operationApi.CarPOJO;
import com.example.domain.externalmodel.VinDecoded;
import org.springframework.stereotype.Service;

@Service
public class VinDecodedToCarPOJOImpl implements VinDecodedToCarPOJO {

    @Override
    public CarPOJO mapToCarPojo(VinDecoded vinDecoded, CarApiEntity carApiEntity) {

        return CarPOJO
                .builder()
                .carBrand(vinDecoded.make.name)
                .carModel(vinDecoded.model.name)
                .carVin(carApiEntity.getVin())
                .price(String.valueOf(carApiEntity.getPrice()))
                .engineHorsePower(String.valueOf(vinDecoded.engine.horsepower))
                .transmission(vinDecoded.transmission.transmissionType)
                .fuelType(vinDecoded.engine.fuelType)
                .status(carApiEntity.getStatus().toString())
                .build();
    }
}
