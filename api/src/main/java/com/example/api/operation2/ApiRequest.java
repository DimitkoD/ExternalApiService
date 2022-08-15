package com.example.api.operation2;

import com.example.api.base.OperationInput;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiRequest implements OperationInput {
    List<CarEntity> carEntities;
}
