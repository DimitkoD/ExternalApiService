package com.example.rest.controller;

import com.example.api.operation2.ApiRequest;
import com.example.api.operation2.ApiResponse;
import com.example.core.service.GetCarsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private final GetCarsService getCarsService;

    public ApiController(GetCarsService getCarsService) {
        this.getCarsService = getCarsService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/getCars")
    public ApiResponse getCars(@RequestBody ApiRequest apiRequest) {
        return getCarsService.getCars(apiRequest);
    }
}
