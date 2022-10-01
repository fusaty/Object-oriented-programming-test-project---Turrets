package com.project.finalExam.app.item.domain;

import lombok.Data;

@Data
public abstract class Entity {

    protected long id;

    public Entity() {
        this.id = IDGen.newId();
    }
}