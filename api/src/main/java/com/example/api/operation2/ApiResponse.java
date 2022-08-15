package com.example.api.operation2;

import com.example.api.base.OperationResult;
import lombok.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse implements OperationResult {
    List<CarPOJO> carsAvailable;
}