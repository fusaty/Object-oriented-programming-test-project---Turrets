package com.project.finalExam.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Veza extends  CompEntity implements Component {
    private String name;
    private Float rychlostOtacania;
    private Float dohlad;
    private Delo delo;
}
