package com.example.domain.externalmodel;

import lombok.*;

import java.util.ArrayList;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Color{
    public String category;
    public ArrayList<Option> options;
}