package com.example.domain.externalmodel;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Valve{
    public String gear;
}