package ru.serdyukov.ip.CarDealershipRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.serdyukov.ip.CarDealershipRestApp.models.CarEvent;

@Repository
public interface CarEventRepository extends JpaRepository<CarEvent, Integer> {
}
