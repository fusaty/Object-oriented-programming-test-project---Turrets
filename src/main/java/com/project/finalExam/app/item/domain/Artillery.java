package com.project.finalExam.app.item.domain;


import com.project.finalExam.components.DeloVelke;
import com.project.finalExam.components.PasovyPodvozok;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artillery extends Entity implements Vehicle  {
    private String name;
    private Float price;
    private Nationality nationality;
    private PasovyPodvozok pasovyPodvozok;
    private DeloVelke deloVelke;
}

