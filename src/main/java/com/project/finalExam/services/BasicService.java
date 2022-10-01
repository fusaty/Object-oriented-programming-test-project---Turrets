package com.project.finalExam.services;

import com.project.finalExam.app.item.domain.*;
import com.project.finalExam.components.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class BasicService implements VehicleService, ComponentService {
    private final Map<Long, Vehicle> vehicles;
    private final Map<Long, Component> components;


    public BasicService() {
        vehicles = new HashMap<>();
        components= new HashMap<>();

        /*
        float cislo = 56;

        PasovyPodvozok pasovy;
        pasovy= new PasovyPodvozok("IS-3M",cislo,cislo,cislo,cislo);

        DeloVelke delo;
        delo= new DeloVelke("122mm BL-9",cislo,cislo,cislo,cislo);

        components.put(delo.getId(), delo);
        components.put(pasovy.getId(), pasovy);

        Veza veza;
        veza= new Veza("IS-3",cislo,cislo,delo);

        HardTank hardTank;
        hardTank= new HardTank("IS-3",cislo, Nationality.GB,pasovy,veza);

        components.put(veza.getId(), veza);


        vehicles.put(hardTank.getId(), hardTank);
        */
    }


    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getId(), vehicle);
    }

    @Override
    public void addLightTank(LightTank vehicle) {
        vehicles.put(vehicle.getId(), vehicle);
    }

    @Override
    public void addHardTank(HardTank vehicle) {
        vehicles.put(vehicle.getId(), vehicle);
    }

    @Override
    public void addArtillery(Artillery vehicle) {
        vehicles.put(vehicle.getId(), vehicle);
    }

    @Override
    public Map<Long, Vehicle> findAllVehicles() {
        return vehicles;
    }

    @Override
    public Optional<Vehicle> findVehicleById(long id) {
        return Optional.ofNullable(vehicles.get(id));
    }








    @Override
    public void addComponent(Component component) {
        components.put(component.getId(), component);
    }

    @Override
    public void addDeloMale(DeloMale vehicle) {
        components.put(vehicle.getId(), vehicle);
    }

    @Override
    public void addDeloVelke(DeloVelke vehicle) {
        components.put(vehicle.getId(), vehicle);
    }

    @Override
    public void addVeza(Veza vehicle) {
        components.put(vehicle.getId(), vehicle);
    }

    @Override
    public void addKolesovyPodvozok(KolesovyPodvozok vehicle) {
        components.put(vehicle.getId(), vehicle);
    }

    @Override
    public void addPasovyPodvozok(PasovyPodvozok vehicle) {
        components.put(vehicle.getId(), vehicle);
    }

    @Override
    public Map<Long, Component> findAllComponents() {
        return components;
    }

    @Override
    public Optional<Component> findComponentById(long id) {
        return Optional.ofNullable(components.get(id));
    }
}
