package com.example.domain.externalmodel;

import lombok.*;

import java.util.ArrayList;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VinDecoded {
    public Make make;
    public Model model;
    public Engine engine;
    public Transmission transmission;
    public String drivenWheels;
    public String numOfDoors;
    public ArrayList<Option> options;
    public ArrayList<Color> colors;
    public Categories categories;
    public String squishVin;
    public ArrayList<Year> years;
    public String matchingType;
}