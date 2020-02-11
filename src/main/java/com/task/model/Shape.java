package com.task.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Shape {
    private String color;
    private static final String FORMAT_PATTERN = "#.##";

    public abstract double calculateArea();

    public abstract void draw();

    private final List<Colors> colorsList = new ArrayList<>(EnumSet.allOf(Colors.class));

    public String getColor() {
        return color;
    }

    public void setColor() {
        int random = new Random().nextInt(16);
        this.color = String.valueOf(colorsList.get(random));
    }

    public double generateRandomDouble() {
        DecimalFormat df = new DecimalFormat(FORMAT_PATTERN);
        return Double.parseDouble(df.format(ThreadLocalRandom.current().nextDouble(1.0, 100.0)));
    }
}
