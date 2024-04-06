package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarEvent;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarModel;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarModelService;

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
}
