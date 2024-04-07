package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class CarErrorResponse {
    private String message;
    private long timestamp;
}
