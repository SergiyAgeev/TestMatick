package com.task.model;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    Circle shape = new Circle();
    private static final Double DELTA = 0.001;

    @Test
    public void calculateAreaOk() {
        shape.setRadius(25.5);
        Assert.assertEquals(2042.82, shape.calculateArea(), DELTA);
    }

    @Test
    public void calculateCircleLengthOk() {
        shape.setRadius(25.5);
        Assert.assertEquals(160.22, shape.calculateLengthOfTheCircle(), DELTA);
    }

    @Test(expected = NullPointerException.class)
    public void calculateAreaByNullRadiusValue() {
        shape.setRadius(null);
    }
}