package ru.serdyukov.ip.CarDealershipRestApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarBrand;
import ru.serdyukov.ip.CarDealershipRestApp.models.Manager;
import ru.serdyukov.ip.CarDealershipRestApp.repositories.CarBrandRepository;
import ru.serdyukov.ip.CarDealershipRestApp.util.CarBrandNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CarBrandService {

    private final CarBrandRepository carBrandRepository;

    @Autowired
    public CarBrandService(CarBrandRepository carBrandRepository) {
        this.carBrandRepository = carBrandRepository;
    }

    public List<CarBrand> findAll() {
        return carBrandRepository.findAll();
    }

    public CarBrand findOne(int id) {
        Optional<CarBrand> foundCarBrand = carBrandRepository.findById(id);
        return foundCarBrand.orElseThrow(CarBrandNotFoundException::new);
    }

    @Transactional
    public void save(CarBrand carBrand) {
        carBrandRepository.save(carBrand);
    }

    @Transactional
    public void delete(int id) {
        CarBrand carBrand = carBrandRepository.findById(id)
                .orElseThrow(() -> new CarBrandNotFoundException());

        carBrandRepository.delete(carBrand);
    }
}
