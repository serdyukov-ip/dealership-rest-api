package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarEvent;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarModel;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarModelService;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarModelErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarModelNotFoundException;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerNotFoundException;

import java.util.List;

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

    @GetMapping()
    public List<CarModel> getCarModels() {
        return carModelService.findAll();
    }

    @GetMapping("/{id}")
    public CarModel getCarModel(@PathVariable("id") int id) {
        return carModelService.findOne(id);
    }

    @ExceptionHandler
    private ResponseEntity<CarModelErrorResponse> handleException(CarModelNotFoundException e) {
        CarModelErrorResponse response = new CarModelErrorResponse(
                "Car Model with this id wasn't found!",
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
