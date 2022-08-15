package com.example.core.service.mapper;

import com.example.api.operation2.CarEntity;
import com.example.api.operation2.CarPOJO;
import com.example.domain.externalmodel.VinDecoded;
import org.springframework.stereotype.Service;

@Service
public class VinDecodedToCarPOJOImpl implements VinDecodedToCarPOJO {

    @Override
    public CarPOJO mapToCarPojo(VinDecoded vinDecoded, CarEntity carEntity) {

        return CarPOJO
                .builder()
                .carBrand(vinDecoded.make.name)
                .carModel(vinDecoded.model.name)
                .carVin(carEntity.getVin())
                .price(String.valueOf(carEntity.getPrice()))
                .engineHorsePower(String.valueOf(vinDecoded.engine.horsepower))
                .transmission(vinDecoded.transmission.transmissionType)
                .fuelType(vinDecoded.engine.fuelType)
                .status(carEntity.getStatus())
                .build();
    }
}
