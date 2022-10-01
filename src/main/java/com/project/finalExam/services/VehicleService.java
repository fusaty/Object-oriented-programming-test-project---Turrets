package com.project.finalExam.services;

import com.project.finalExam.app.item.domain.Artillery;
import com.project.finalExam.app.item.domain.HardTank;
import com.project.finalExam.app.item.domain.LightTank;
import com.project.finalExam.app.item.domain.Vehicle;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public interface VehicleService {
    void addVehicle(Vehicle vehicle);

    void addLightTank(LightTank lightTank);

    void addHardTank(HardTank hardTank);

    void addArtillery(Artillery artillery);

    Map<Long, Vehicle> findAllVehicles();

    Optional<Vehicle> findVehicleById(long id);
}
