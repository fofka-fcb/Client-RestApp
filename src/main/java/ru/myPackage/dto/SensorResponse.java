package ru.myPackage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class SensorResponse {

    @JsonProperty("sensors")
    List<SensorDTO> sensors;

}
