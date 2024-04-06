package ru.serdyukov.ip.CarDealershipRestApp.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarBrand;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarEvent;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarEventService;

import java.util.List;

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

    @GetMapping()
    public List<CarEvent> getCarEvents() {
        return carEventService.findAll();
    }

    @GetMapping("/{id}")
    public CarEvent getCarEvent(@PathVariable("id") int id) {
        return carEventService.findOne(id);
    }
}
