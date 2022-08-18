package com.example.api.model;

import com.example.api.base.OperationResult;
import lombok.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetCarsResponse implements OperationResult {
    List<CarPOJO> carsAvailable;
}
