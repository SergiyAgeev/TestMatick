package com.task.model;

import com.task.service.PerimeterService;
import java.text.DecimalFormat;

public class Triangle extends Shape implements PerimeterService {
    private double a;
    private double b;
    private double c;
    private double h;
    private static final String FORMAT_PATTERN = "#.##";

    public Triangle() {
        DecimalFormat df = new DecimalFormat(FORMAT_PATTERN);
        this.a = generateRandomDouble();
        this.b = generateRandomDouble();
        this.c = Double.parseDouble(df.format(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));
        this.h = Double.parseDouble(df.format(2 * (a / b)));
        super.setColor();
    }

    public Triangle(double a, double b) {
        DecimalFormat df = new DecimalFormat(FORMAT_PATTERN);
        this.a = a;
        this.b = b;
        this.c = Double.parseDouble(df.format(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));
        this.h = Double.parseDouble(df.format(2 * (a / b)));
    }

    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
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
        DecimalFormat df = new DecimalFormat(FORMAT_PATTERN);
        double area = (b * a) / 2;
        return Double.parseDouble(df.format(area));
    }

    @Override
    public double calculatePerimeter() {
        DecimalFormat df = new DecimalFormat(FORMAT_PATTERN);
        return Double.parseDouble(df.format(a + b + c));
    }

    @Override
    public void draw() {
        System.out.println("Triangle: "
                + "color = " + getColor()
                + ", area value = " + calculateArea() + ", "
                + "perimeter value = " + calculatePerimeter()
                + ", Sides: { side a = " + getA()
                + ", side b = " + getB()
                + ", side c = " + getC()
                + ", height = " + getH() + " }");
    }
}
