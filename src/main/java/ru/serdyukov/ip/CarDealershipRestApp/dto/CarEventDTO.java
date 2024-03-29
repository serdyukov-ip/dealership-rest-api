package ru.serdyukov.ip.CarDealershipRestApp.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CarEventDTO {

    @NotEmpty(message = "Id should not be empty")
    private int id;

    @NotEmpty(message = "Car Id should not be empty")
    private int carId;

    @NotEmpty(message = "Event Id should not be empty")
    private int eventId;

    @NotEmpty(message = "Manager Id should not be empty")
    private int managerId;

    @NotEmpty(message = "Operation date should not be empty")
    private LocalDateTime operationDate;



}
