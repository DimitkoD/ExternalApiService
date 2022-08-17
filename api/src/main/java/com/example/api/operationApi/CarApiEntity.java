package com.example.api.operationApi;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class CarApiEntity {
    private Long carId;
    private String vin;
    private double price;
    private Boolean status;
}
