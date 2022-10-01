package com.project.finalExam.services;

import com.project.finalExam.app.item.domain.Artillery;
import com.project.finalExam.app.item.domain.HardTank;
import com.project.finalExam.app.item.domain.LightTank;
import com.project.finalExam.app.item.domain.Vehicle;
import com.project.finalExam.components.*;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public interface ComponentService {
    void addComponent(Component component);

    void addDeloVelke(DeloVelke component);

    void addDeloMale(DeloMale component);

    void addKolesovyPodvozok(KolesovyPodvozok kolesovyPodvozok);

    void addPasovyPodvozok(PasovyPodvozok pasovyPodvozok);

    void addVeza(Veza veza);

    Map<Long, Component> findAllComponents();


    Optional<Component> findComponentById(long id);
}
