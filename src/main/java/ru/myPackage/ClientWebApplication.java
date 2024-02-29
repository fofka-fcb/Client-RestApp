package ru.myPackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import ru.myPackage.dto.SensorDTO;
import ru.myPackage.services.SensorService;

import java.util.List;

@SpringBootApplication
public class ClientWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientWebApplication.class, args);

//		String url_2 = "http://localhost:7070/sensor/1";
//		String res_2 = restTemplate.getForObject(url_2, String.class);
//		System.out.println();
//		System.out.println(res_2);
//
//		String url_3 = "http://localhost:7070/measurements/1";
//		String res_3 = restTemplate.getForObject(url_3, String.class);
//		System.out.println();
//		System.out.println(res_3);

//        SensorService sensorService = new SensorService(new ObjectMapper());
//
//        List<SensorDTO> list = sensorService.getAllSensors().getSensors();
//
//        for (SensorDTO sensor : list) {
//            System.out.println(sensor.getName());
//        }
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}
