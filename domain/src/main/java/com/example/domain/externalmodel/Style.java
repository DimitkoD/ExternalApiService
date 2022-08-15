package com.example.domain.externalmodel;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Style{
    public int id;
    public String name;
    public Submodel submodel;
    public String trim;
}