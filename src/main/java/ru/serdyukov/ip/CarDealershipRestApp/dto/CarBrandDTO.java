package ru.serdyukov.ip.CarDealershipRestApp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CarBrandDTO {

    @NotEmpty(message = "Id should not be empty")
    private int id;

    @NotEmpty(message = "Name should not be empty")
    private String name;

}
