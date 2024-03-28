package ru.serdyukov.ip.CarDealershipRestApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.serdyukov.ip.CarDealershipRestApp.models.Event;
import ru.serdyukov.ip.CarDealershipRestApp.models.Manager;
import ru.serdyukov.ip.CarDealershipRestApp.repositories.EventRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public Event findOne(int id) {
        Optional<Event> foundEvent = eventRepository.findById(id);
        return foundEvent.orElse(null);
    }

    @Transactional
    public void save(Event event) {
        eventRepository.save(event);
    }

}
