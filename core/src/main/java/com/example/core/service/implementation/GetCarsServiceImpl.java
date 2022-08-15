package com.example.core.service.implementation;

import com.example.api.operationApi.ApiRequest;
import com.example.api.operationApi.ApiResponse;
import com.example.api.operationApi.CarApiEntity;
import com.example.api.operationApi.CarPOJO;
import com.example.core.service.GetCarsService;
import com.example.core.service.exception.ApiServiceException;
import com.example.core.service.mapper.VinDecodedToCarPOJO;
import com.example.domain.externalmodel.VinDecoded;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class GetCarsServiceImpl implements GetCarsService {
    private final RestTemplate restTemplate;
    private final VinDecodedToCarPOJO vinDecodedToCarPOJO;

    public GetCarsServiceImpl(RestTemplate restTemplate, VinDecodedToCarPOJO vinDecodedToCarPOJO) {
        this.restTemplate = restTemplate;
        this.vinDecodedToCarPOJO = vinDecodedToCarPOJO;
    }
    @Override
    public ApiResponse getCars(ApiRequest apiRequest) {
        List<CarPOJO> carPOJOS = new ArrayList<>();
        try {
            Stream.of(apiRequest)
                    .map(x -> x.getCarEntities()
                            .stream()
                            .map(CarApiEntity::getVin)
                            .collect(Collectors.toList())
                    )
                    .forEach(vin -> {
                        for(int i = 0; i < vin.size(); i++) {
                            String url = "https://auto.dev/api/vin/"
                                    + vin.get(i)
                                    + "?apikey=ZrQEPSkKZGRvYnJldjQ4QGdtYWlsLmNvbQ";
                            carPOJOS.add(vinDecodedToCarPOJO
                                    .mapToCarPojo(restTemplate
                                                    .getForObject(url, VinDecoded.class),
                                                  apiRequest.getCarEntities().get(i)));
                        }
                    });

            return ApiResponse
                    .builder()
                    .carsAvailable(carPOJOS)
                    .build();

        } catch (Exception e) {
            throw new ApiServiceException();
        }

    }
}
