package ru.serdyukov.ip.CarDealershipRestApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarEvent;
import ru.serdyukov.ip.CarDealershipRestApp.models.Manager;
import ru.serdyukov.ip.CarDealershipRestApp.repositories.CarEventRepository;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarEventNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CarEventService {

    private final CarEventRepository carEventRepository;

    @Autowired
    public CarEventService(CarEventRepository carEventRepository) {
        this.carEventRepository = carEventRepository;
    }

    public List<CarEvent> findAll() {
        return carEventRepository.findAll();
    }

    public CarEvent findOne(int id) {
        Optional<CarEvent> foundCarEvent = carEventRepository.findById(id);
        return foundCarEvent.orElseThrow(CarEventNotFoundException::new);
    }

    @Transactional
    public void save(CarEvent carEvent) {
        carEventRepository.save(carEvent);
    }

}
