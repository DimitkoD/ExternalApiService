package com.example.domain.service.implementation;

import com.example.api.model.GetCarsRequest;
import com.example.api.model.GetCarsResponse;
import com.example.domain.service.GetCarsService;
import com.example.domain.service.exception.ApiServiceException;
import com.example.domain.externalmodel.VinDecoded;
import com.example.domain.service.mapper.VinDecodedToCarPOJO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.stream.Collectors;

@Service
public class GetCarsServiceImpl implements GetCarsService {
    private final RestTemplate restTemplate;
    private final VinDecodedToCarPOJO vinDecodedToCarPOJO;

    public GetCarsServiceImpl(RestTemplate restTemplate, VinDecodedToCarPOJO vinDecodedToCarPOJO) {
        this.restTemplate = restTemplate;
        this.vinDecodedToCarPOJO = vinDecodedToCarPOJO;
    }
    @Override
    public GetCarsResponse getCars(GetCarsRequest getCarsRequest) {

        try {
            return GetCarsResponse
                    .builder()
                    .carsAvailable(
                            getCarsRequest.getCarEntities()
                                    .stream()
                                    .map(carEntity -> {
                                                String url = "https://auto.dev/api/vin/"
                                                        + carEntity.getVin()
                                                        + "?apikey=ZrQEPSkKZGRvYnJldjQ4QGdtYWlsLmNvbQ";
                                                return vinDecodedToCarPOJO
                                                        .mapToCarPojo(
                                                                restTemplate
                                                                        .getForObject(url, VinDecoded.class),
                                                                carEntity);
                                            }
                                    )
                                    .collect(Collectors.toList())
                    )
                    .build();

        } catch (Exception e) {
            throw new ApiServiceException();
        }

    }
}
