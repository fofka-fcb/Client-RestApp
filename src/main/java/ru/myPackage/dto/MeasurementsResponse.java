package ru.myPackage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MeasurementsResponse {

    @JsonProperty("measurements")
    private List<MeasurementsDTO> measurements;

}
