package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class Main extends Application {

    public void start(Stage stage) {
        stage.setTitle("Agar.io");

        Group root = new Group();


        Sprite sprite = new Sprite(500.0, 350.0, 80.0);
        Food food = new Food(5);

        Circle spritecircle = sprite.createCircle();

        root.setOnMouseMoved((MouseEvent event) -> {
            double mouseX = event.getX();
            double mouseY = event.getY();
            System.out.println(mouseX + " " + mouseY);
            sprite.setXCo(mouseX);
            sprite.setYCo(mouseY);

            spritecircle.setCenterX(mouseX);
            spritecircle.setCenterY(mouseY);
        });

        root.getChildren().add(spritecircle);
        root.getChildren().add(food);

        Scene scene = new Scene(root, 1000, 700);

        stage.setScene(scene);

        stage.show();
    }

    /*Collision Detection*/
    /*Run through array each animation tick then see if there is an item that is within the intersect*/


    public static void main(String[] args) {
        launch(args);
    }
}
