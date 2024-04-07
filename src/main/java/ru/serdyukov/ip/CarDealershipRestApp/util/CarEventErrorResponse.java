package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class CarEventErrorResponse {
    private String message;
    private long timestamp;

    public CarEventErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
