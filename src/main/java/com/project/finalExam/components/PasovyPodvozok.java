package com.project.finalExam.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasovyPodvozok extends CompEntity implements Component {
    private String name;
    private Float nosnost;
    private Float rychlostOtacania;
    private Float maxRychlost;
    private Float sirkaPasu;
}
