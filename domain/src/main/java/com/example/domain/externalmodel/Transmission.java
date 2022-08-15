package com.example.domain.externalmodel;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Transmission{
    public String name;
    public String equipmentType;
    public String availability;
    public String transmissionType;
    public String numberOfSpeeds;
}