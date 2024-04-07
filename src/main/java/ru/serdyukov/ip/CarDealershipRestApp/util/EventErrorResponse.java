package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class EventErrorResponse {
    private String message;
    private long timestamp;

    public EventErrorResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
