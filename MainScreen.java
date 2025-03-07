package org.example;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MainScreen {
    private double width;
    private double height;

    public MainScreen(double width, double height,{
        this.width = width;
        this.height = height;

    }

    public Rectangle createRectangle() {
        Rectangle SceneRectangle = new Rectangle(width, height);
        SceneRectangle.setFill(Color.WHITE); 
        return SceneRectangle;
    }


    public void setWidth(double width) {
        this.width = this.width;
    }

    public void setYCo(double yCo) {
        this.yCo = yCo;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getXCo() {
        return xCo;
    }

    public double getYCo() {
        return yCo;
    }

    public double getRadius() {
        return radius;
    }
}
