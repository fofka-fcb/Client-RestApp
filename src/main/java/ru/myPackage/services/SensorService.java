package ru.myPackage.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.myPackage.dto.MeasurementsResponse;
import ru.myPackage.dto.SensorDTO;
import ru.myPackage.dto.SensorResponse;


@Service
@RequiredArgsConstructor
public class SensorService {

    private final ObjectMapper objectMapper;

    RestTemplate restTemplate = new RestTemplate();

    public SensorResponse getAllSensors() {
        String url = "http://localhost:7070/sensor";
//        String jsonAnswer = restTemplate.getForObject(url, String.class);
//
//        SensorResponse sensorResponse;
//        try {
//            sensorResponse = objectMapper.readValue(jsonAnswer, SensorResponse.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }

        SensorResponse sensorResponse = restTemplate.getForObject(url, SensorResponse.class);

        return sensorResponse;
    }

    public MeasurementsResponse getOneSensorWithMeasurements(int id) {
        String url = "http://localhost:7070/measurements/" + id;
//        String jsonAnswer = restTemplate.getForObject(url, String.class);
//
//        MeasurementsResponse measurementsResponse;
//        try {
//            measurementsResponse = objectMapper.readValue(jsonAnswer, MeasurementsResponse.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
        MeasurementsResponse measurementsResponse= restTemplate.getForObject(url, MeasurementsResponse.class);

        return measurementsResponse;
    }
}
