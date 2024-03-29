package ru.serdyukov.ip.CarDealershipRestApp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ManagerDTO {

    @NotEmpty(message = "Id should not be empty")
    int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Last Name should be between 2 and 30 characters")
    String lastName;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "First Name should be between 2 and 30 characters")
    String firstName;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    String phoneNumber;

}
