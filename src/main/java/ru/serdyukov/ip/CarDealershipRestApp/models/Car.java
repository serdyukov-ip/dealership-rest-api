package ru.serdyukov.ip.CarDealershipRestApp.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand_id")
    private int brandId;

    @Column(name = "model_id")
    private int modelId;

    @Column(name = "vin")
    private String vin;

}
