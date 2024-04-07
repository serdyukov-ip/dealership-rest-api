package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.serdyukov.ip.CarDealershipRestApp.dto.ManagerDTO;
import ru.serdyukov.ip.CarDealershipRestApp.models.Event;
import ru.serdyukov.ip.CarDealershipRestApp.models.Manager;
import ru.serdyukov.ip.CarDealershipRestApp.services.ManagerService;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarBrandErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarBrandNotFoundException;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/managers/")
public class ManagerController {

    private final ManagerService managerService;
    private final ModelMapper modelMapper;

    @Autowired
    public ManagerController(ManagerService managerService, ModelMapper modelMapper) {
        this.managerService = managerService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    public List<Manager> getManagers() {
        return managerService.findAll();
    }

    @GetMapping("/{id}")
    public Manager getManager(@PathVariable("id") int id) {
        return managerService.findOne(id);
    }

    @ExceptionHandler
    private ResponseEntity<ManagerErrorResponse> handleException(ManagerNotFoundException e) {
        ManagerErrorResponse response = new ManagerErrorResponse(
                "Manager with this id wasn't found!",
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
