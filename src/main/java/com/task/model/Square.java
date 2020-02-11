package com.task.model;

import com.task.service.PerimeterService;
import java.text.DecimalFormat;

public class Square extends Shape implements PerimeterService {
    private double a;
    private static final String FORMAT_PATTERN = "#.##";

    public Square() {
        this.a = generateRandomDouble();
        super.setColor();
    }

    public double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double calculateArea() {
        DecimalFormat df = new DecimalFormat(FORMAT_PATTERN);
        return Double.parseDouble(df.format(a * a));
    }

    @Override
    public double calculatePerimeter() {
        DecimalFormat df = new DecimalFormat(FORMAT_PATTERN);
        return Double.parseDouble(df.format(4 * a));
    }

    @Override
    public void draw() {
        System.out.println("Square: "
                + "color = " + getColor()
                + ", area value = " + calculateArea() + ", "
                + "perimeter value = " + calculatePerimeter()
                + ", Side = " + getA());
    }
}
