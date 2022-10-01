package com.project.finalExam.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeloMale extends CompEntity implements Delo, Component   {
    private String name;
    private Float kaliber;
    private Float kadencia;
    private Float rozptyl;
    private Float pocetNabojov;
}
