package com.example.domain.externalmodel;

import lombok.*;

import java.util.ArrayList;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Year{
    public int id;
    public int year;
    public ArrayList<Style> styles;
}