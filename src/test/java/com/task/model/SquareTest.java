package com.task.model;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    Square shape = new Square();
    private static final Double DELTA = 0.001;

    @Test
    public void calculateAreaOk() {
        shape.setA(15.0);
        Assert.assertEquals(225.0, shape.calculateArea(), DELTA);
    }

    @Test
    public void calculatePerimeterOk() {
        shape.setA(15.0);
        Assert.assertEquals(60.0, shape.calculatePerimeter(), DELTA);
    }

    @Test(expected = NullPointerException.class)
    public void calculateAreaByNullRadiusValue() {
        shape.setA(null);
    }
}