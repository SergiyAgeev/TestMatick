package com.task.model;

import org.junit.Assert;
import org.junit.Test;

public class TrapezeTest {
    Trapeze shape = new Trapeze();
    private static final Double DELTA = 0.001;

    @Test
    public void calculateAreaOk() {
        shape.setA(15.2);
        shape.setB(8.0);
        shape.setH(7.3);
        Assert.assertEquals(84.68, shape.calculateArea(), DELTA);
    }


    @Test(expected = NullPointerException.class)
    public void calculateAreaByNullRadiusValue() {
        shape.setA(null);
        shape.setB(null);
        shape.setH(null);

    }
}