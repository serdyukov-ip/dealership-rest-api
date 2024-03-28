package ru.serdyukov.ip.CarDealershipRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.serdyukov.ip.CarDealershipRestApp.models.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {
}
