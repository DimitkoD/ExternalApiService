package com.example.domain.externalmodel;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Engine{
    public String name;
    public String equipmentType;
    public String availability;
    public double compressionRatio;
    public int cylinder;
    public double size;
    public int displacement;
    public String configuration;
    public String fuelType;
    public int horsepower;
    public int torque;
    public int totalValves;
    public String type;
    public String code;
    public String compressorType;
    public Rpm rpm;
    public Valve valve;
}