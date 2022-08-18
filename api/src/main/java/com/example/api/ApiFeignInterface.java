package com.example.api;

import com.example.api.model.GetCarsRequest;
import com.example.api.model.GetCarsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "findCars", url = "http://localhost:8082")
public interface ApiFeignInterface {
    @RequestMapping(method = RequestMethod.POST, value = "/getCars")
    GetCarsResponse getCars(@RequestBody GetCarsRequest getCarsRequest);
}
