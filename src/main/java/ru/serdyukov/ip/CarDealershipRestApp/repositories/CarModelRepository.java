package ru.serdyukov.ip.CarDealershipRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarModel;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Integer> {
}
