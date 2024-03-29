package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarModelService;

@RestController
@RequestMapping("/api/carmodels/")
public class CarModelController {

    private final CarModelService carModelService;
    private final ModelMapper modelMapper;

    @Autowired
    public CarModelController(CarModelService carModelService, ModelMapper modelMapper) {
        this.carModelService = carModelService;
        this.modelMapper = modelMapper;
    }
}
