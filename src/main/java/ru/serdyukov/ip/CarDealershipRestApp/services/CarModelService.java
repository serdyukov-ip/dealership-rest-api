package ru.serdyukov.ip.CarDealershipRestApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarModel;
import ru.serdyukov.ip.CarDealershipRestApp.models.Manager;
import ru.serdyukov.ip.CarDealershipRestApp.repositories.CarModelRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CarModelService {

    private final CarModelRepository carModelRepository;

    @Autowired
    public CarModelService(CarModelRepository carModelRepository) {
        this.carModelRepository = carModelRepository;
    }

    public List<CarModel> findAll() {
        return carModelRepository.findAll();
    }

    public CarModel findOne(int id) {
        Optional<CarModel> foundCarModel = carModelRepository.findById(id);
        return foundCarModel.orElse(null);
    }

    @Transactional
    public void save(CarModel carModel) {
        carModelRepository.save(carModel);
    }
}
