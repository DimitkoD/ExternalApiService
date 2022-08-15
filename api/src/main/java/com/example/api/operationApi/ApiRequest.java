package com.example.api.operationApi;

import com.example.api.base.OperationInput;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiRequest implements OperationInput {
    List<CarApiEntity> carEntities;
}
