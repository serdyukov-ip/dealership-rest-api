package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class CarBrandErrorResponse {
    private String message;
    private long timestamp;

    public CarBrandErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
