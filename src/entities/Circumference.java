package entities;

import interfaces.GeometricForm;

public class Circumference implements GeometricForm {

    private Double radius;


    public Circumference(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double CalculateArea() {
        return Math.PI * (radius*radius);
    }
}
