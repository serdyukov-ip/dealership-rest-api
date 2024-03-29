package ru.serdyukov.ip.CarDealershipRestApp.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CarDTO {

    @NotEmpty(message = "Id should not be empty")
    private int id;

    @NotEmpty(message = "Id should not be empty")
    private int brandId;

    @NotEmpty(message = "Id should not be empty")
    private int modelId;

    @NotEmpty(message = "Id should not be empty")
    private String vin;


}
