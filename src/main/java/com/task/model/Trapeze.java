package com.task.model;

import java.text.DecimalFormat;

public class Trapeze extends Shape {
    private double a;
    private double b;
    private double h;

    public Trapeze() {
        this.a = generateRandomDouble();
        this.b = generateRandomDouble();
        this.h = generateRandomDouble();
        super.setColor();
    }

    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double calculateArea() {
        DecimalFormat df = new DecimalFormat("#.##");
        double area = ((a + b) * h) / 2;
        return Double.parseDouble(df.format(area));
    }

    @Override
    public void draw() {
        System.out.println("Trapeze: "
                + "color = " + getColor()
                + ", area value = " + calculateArea()
                + "  Sides: { " + "side a = " + getA()
                + ", side b = " + getB()
                + ", height = " + getH() + " }");
    }
}
