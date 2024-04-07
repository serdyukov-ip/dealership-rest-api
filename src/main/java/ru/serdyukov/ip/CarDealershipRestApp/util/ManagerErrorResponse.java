package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class ManagerErrorResponse {
    private String message;
    private long timestamp;

    public ManagerErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
