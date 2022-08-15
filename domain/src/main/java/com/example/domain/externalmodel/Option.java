package com.example.domain.externalmodel;

import lombok.*;

import java.util.ArrayList;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Option{
    public String category;
    public ArrayList<Option> options;
    public String id;
    public String name;
    public String equipmentType;
    public String availability;
    public String description;
}