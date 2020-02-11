package com.task;

import com.task.model.Circle;
import com.task.model.Shape;
import com.task.model.Square;
import com.task.model.Trapeze;
import com.task.model.Triangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] randomArray = randomised();
        List<Shape> shapeList = new ArrayList<>();
        for (int value : randomArray) {
            switch (value) {
                case 1:
                    shapeList.add(new Circle());
                    break;
                case 2:
                    shapeList.add(new Square());
                    break;
                case 3:
                    shapeList.add(new Trapeze());
                    break;
                default:
                    shapeList.add(new Triangle());
                    break;
            }
        }
        shapeList.forEach(Shape::draw);
    }

    private static int[] randomised() {
        int[] randomArray = new int[new Random().nextInt(50)];
        Arrays.setAll(randomArray, i -> (Math.abs(new Random().nextInt(4))));
        return randomArray;
    }
}
