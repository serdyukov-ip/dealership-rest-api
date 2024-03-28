package ru.serdyukov.ip.CarDealershipRestApp.models;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "carevents")
public class CarEvent {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "car_id")
    private int carId;

    @Column(name = "event_id")
    private int eventId;

    @Column(name = "manager_id")
    private int managerId;

    @Column(name = "operation_date")
    private LocalDateTime operationDate;

}
