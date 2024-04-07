package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.serdyukov.ip.CarDealershipRestApp.models.Car;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarService;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarBrandNotFoundException;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerNotFoundException;

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

    @ExceptionHandler
    private ResponseEntity<CarErrorResponse> handleException(CarBrandNotFoundException e) {
        CarErrorResponse response = new CarErrorResponse(
                "Car with this id wasn't found!",
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
