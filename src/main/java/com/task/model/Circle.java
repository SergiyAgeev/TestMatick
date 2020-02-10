package com.task.model;

import com.task.service.LengthOfCircleService;
import java.text.DecimalFormat;

public class Circle extends Shape implements LengthOfCircleService {
    private double radius;

    public Circle() {
        radius = generateRandomDouble();
        super.setColor();
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double calculateArea() {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(Math.PI * (radius * radius)));
    }

    @Override
    public double calculateLengthOfTheCircle() {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(2 * Math.PI * radius));
    }

    @Override
    public void draw() {
        System.out.println("Circle: " + "color = " + getColor()
                + ", area value = " + calculateArea() + ", "
                + "length value = " + calculateLengthOfTheCircle()
                + ", Radius: " + getRadius());
    }
}
