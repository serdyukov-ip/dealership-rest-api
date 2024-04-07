package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class CarEventErrorResponse {
    private String message;
    private long timestamp;
}
