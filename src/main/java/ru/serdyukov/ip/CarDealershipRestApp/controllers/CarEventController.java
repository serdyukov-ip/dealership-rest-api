package ru.serdyukov.ip.CarDealershipRestApp.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarEventService;

@RestController
@RequestMapping("/api/carevents/")
public class CarEventController {

    private final CarEventService carEventService;
    private final ModelMapper modelMapper;

    @Autowired
    public CarEventController(CarEventService carEventService, ModelMapper modelMapper) {
        this.carEventService = carEventService;
        this.modelMapper = modelMapper;
    }
}
