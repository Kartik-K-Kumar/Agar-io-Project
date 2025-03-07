package org.example;
import javafx.scene.shape.Circle;

public class Sprite {
    private double xCo;
    private double yCo;
    private double radius;
    public Sprite(double xCo, double yCo, double radius){
        this.xCo = xCo;
        this.yCo = yCo;
        this.radius = radius;
    }

    public Circle createCircle() {
        Circle spriteCircle = new Circle(xCo, yCo, radius);
        spriteCircle.setFill(javafx.scene.paint.Color.BLUE);
        return spriteCircle;
    }


    public void setXCo(double xCo) {
        this.xCo = xCo;
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
