package com.k.testing.shape;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private String shapeName;
    private Double radius;

    public Circle(String ShapeName, Double radius) {
        this.shapeName = ShapeName;
        this.radius = radius;
    }
    public String getShapeName() {
        return shapeName;
    }
    public Double getField() {
        return radius * PI;
    }
}
