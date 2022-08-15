package com.example.domain.externalmodel;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Model{
    public String id;
    public String name;
    public String niceName;
}