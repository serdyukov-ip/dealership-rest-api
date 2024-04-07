package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serdyukov.ip.CarDealershipRestApp.models.Car;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarBrand;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarBrandService;

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
}
