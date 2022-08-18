package com.example.api.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CarPOJO {
    private String carVin;
    private String carBrand;
    private String carModel;
    private String price;
    private String status;
    private String engineHorsePower;
    private String transmission;
    private String fuelType;
}
