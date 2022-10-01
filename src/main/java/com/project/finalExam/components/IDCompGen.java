package com.project.finalExam.components;

import java.util.concurrent.atomic.AtomicLong;

public class IDCompGen {
    private static final AtomicLong generator = new AtomicLong(0);

    public static long newId() {
        return generator.getAndIncrement();
    }
}
