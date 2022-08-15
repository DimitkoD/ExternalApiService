package com.example.domain.externalmodel;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Categories{
    public String primaryBodyType;
    public String market;
    public String manufacturerCabType;
    public String epaClass;
    public String vehicleSize;
    public String vehicleType;
    public String vehicleStyle;
}