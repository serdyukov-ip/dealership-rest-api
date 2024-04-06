package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serdyukov.ip.CarDealershipRestApp.models.Car;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarService;

import java.util.List;

@RestController
@RequestMapping("/api/cars/")
public class CarController {

    private final CarService carService;
    private final ModelMapper modelMapper;

    @Autowired
    public CarController(CarService carService, ModelMapper modelMapper) {
        this.carService = carService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    public List<Car> getCars() {
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable("id") int id) {
        return carService.findOne(id);
    }




}
