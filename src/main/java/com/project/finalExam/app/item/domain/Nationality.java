package com.project.finalExam.app.item.domain;

import lombok.Getter;

@Getter
public enum Nationality {
    USA( "USA"),
    USSR( "USSR"),
    GB( "Great Britain"),
    GER( "Germany");



    public final String name;

    Nationality(String name) {
        this.name = name;
    }
}
