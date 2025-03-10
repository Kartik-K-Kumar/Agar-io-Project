package org.example;

import javafx.scene.shape.Circle;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import java.util.Random;

public class Food extends Group {
    public Food(double radius) {
        Random random = new Random();

        int count = 0;
        while (count < 200) {
            double randomX = random.nextDouble() * (1000 - 2 * radius) + radius;
            double randomY = random.nextDouble() * (700 - 2 * radius) + radius;


            Circle foodCircle = new Circle(randomX, randomY, radius);
            foodCircle.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
            //foodCircle.setFoodx(randomX);
            //foodCircle.setFoody(randomY);
            foodCircle.setViewOrder(-1);

            this.getChildren().add(foodCircle);
            count++;
        }
    }
}
