package com.project.finalExam.components;

import com.project.finalExam.app.item.domain.IDGen;
import lombok.Data;

@Data
public class CompEntity {

    protected long id;

    public CompEntity() {
        this.id = IDCompGen.newId();
    }
}
