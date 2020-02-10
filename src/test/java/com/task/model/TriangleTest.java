package com.task.model;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    private static final Double DELTA = 0.001;

    @Test
    public void calculateAreaOk() {
        Triangle triangle = new Triangle(10.2, 14.8);
        Assert.assertEquals(75.48, triangle.calculateArea(), DELTA);
    }

    @Test
    public void calculatePerimeterOk() {
        Triangle triangle = new Triangle(10.2, 14.8);
        Assert.assertEquals(42.97, triangle.calculatePerimeter(), DELTA);
    }

    @Test(expected = NullPointerException.class)
    public void calculateAreaByNullRadiusValue() {
        Triangle triangle = new Triangle();
        triangle.setA(null);
        triangle.setB(null);

    }
}