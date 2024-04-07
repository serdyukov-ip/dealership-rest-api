package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.serdyukov.ip.CarDealershipRestApp.models.Car;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarBrand;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarBrandService;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarBrandErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarBrandNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/api/carbrands/")
public class CarBrandController {

    private final CarBrandService carBrandService;
    private final ModelMapper modelMapper;

    @Autowired
    public CarBrandController(CarBrandService carBrandService, ModelMapper modelMapper) {
        this.carBrandService = carBrandService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    public List<CarBrand> getCarBrands() {
        return carBrandService.findAll();
    }

    @GetMapping("/{id}")
    public CarBrand getCarBrand(@PathVariable("id") int id) {
        return carBrandService.findOne(id);
    }

    @ExceptionHandler
    private ResponseEntity<CarBrandErrorResponse> handleException(CarBrandNotFoundException e) {
        CarBrandErrorResponse response = new CarBrandErrorResponse(
                "Car Brand with this id wasn't found!",
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
