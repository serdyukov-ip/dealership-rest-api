package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serdyukov.ip.CarDealershipRestApp.dto.ManagerDTO;
import ru.serdyukov.ip.CarDealershipRestApp.services.ManagerService;

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

}
