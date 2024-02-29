package ru.myPackage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MeasurementsDTO {

    @JsonProperty("temp")
    private Double temp;

    @JsonProperty("raining")
    private Boolean raining;

    @JsonProperty("owner")
    private SensorDTO owner;

}
