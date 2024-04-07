package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class CarModelErrorResponse {
    private String message;
    private long timestamp;
}
