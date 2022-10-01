package com.project.finalExam.app.item.domain;

import java.util.concurrent.atomic.AtomicLong;

public class IDGen {
    private static final AtomicLong generator = new AtomicLong(0);

    public static long newId() {
        return generator.getAndIncrement();
    }
}
