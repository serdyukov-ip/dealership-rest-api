package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarModel;
import ru.serdyukov.ip.CarDealershipRestApp.models.Event;
import ru.serdyukov.ip.CarDealershipRestApp.services.EventService;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarEventNotFoundException;
import ru.serdyukov.ip.CarDealershipRestApp.util.EventErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerErrorResponse;
import ru.serdyukov.ip.CarDealershipRestApp.util.ManagerNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/api/events/")
public class EventController {

    private final EventService eventService;
    private final ModelMapper modelMapper;

    @Autowired
    public EventController(EventService eventService, ModelMapper modelMapper) {
        this.eventService = eventService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    public List<Event> getEvents() {
        return eventService.findAll();
    }

    @GetMapping("/{id}")
    public Event getEvent(@PathVariable("id") int id) {
        return eventService.findOne(id);
    }

    @ExceptionHandler
    private ResponseEntity<EventErrorResponse> handleException(CarEventNotFoundException e) {
        EventErrorResponse response = new EventErrorResponse(
                "Event with this id wasn't found!",
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
