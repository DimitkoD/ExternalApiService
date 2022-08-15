package com.example.core.service;

import com.example.api.operationApi.ApiRequest;
import com.example.api.operationApi.ApiResponse;

public interface GetCarsService {
    ApiResponse getCars(ApiRequest apiRequest);
}
