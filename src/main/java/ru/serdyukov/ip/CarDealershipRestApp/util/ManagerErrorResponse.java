package ru.serdyukov.ip.CarDealershipRestApp.util;

import lombok.Data;

@Data
public class ManagerErrorResponse {
    private String message;
    private long timestamp;
}
