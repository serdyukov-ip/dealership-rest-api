package ru.serdyukov.ip.CarDealershipRestApp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarModel;
import ru.serdyukov.ip.CarDealershipRestApp.models.Event;
import ru.serdyukov.ip.CarDealershipRestApp.services.EventService;

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
}
