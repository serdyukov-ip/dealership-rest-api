package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class CarModelErrorResponse {
    private String message;
    private long timestamp;

    public CarModelErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
