package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class CarErrorResponse {
    private String message;
    private long timestamp;

    public CarErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
