package com.example.api.operation2;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class CarEntity {
    private Long carId;
    private String vin;
    private double price;
    private String status;
}
