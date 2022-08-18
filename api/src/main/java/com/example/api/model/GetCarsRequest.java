package com.example.api.model;

import com.example.api.base.OperationInput;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetCarsRequest implements OperationInput {
    List<CarApiEntity> carEntities;
}
