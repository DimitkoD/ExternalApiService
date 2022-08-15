package com.example.domain.externalmodel;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Rpm{
    public int horsepower;
    public int torque;
}