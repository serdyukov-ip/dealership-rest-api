package ru.serdyukov.ip.CarDealershipRestApp.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarBrand;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarEvent;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarEventService;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarEventErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarEventNotFoundException;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerNotFoundException;

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

    @ExceptionHandler
    private ResponseEntity<CarEventErrorResponse> handleException(CarEventNotFoundException e) {
        CarEventErrorResponse response = new CarEventErrorResponse(
                "Car Event with this id wasn't found!",
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
