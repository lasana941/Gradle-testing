package com.kodilla.testing.shape;

public class Shape {
    String ShapeName;
    Double Field;

    public Shape(String ShapeName, Double Field) {
        this.ShapeName = ShapeName;
        this.Field = Field;
    }
    public String getShapeName() {
        return ShapeName;
    }
    public Double getField() {
        return Field;
    }
}
/*
public enum Shape {
    square(0), triangle(0), circle(0);
    private int value;

    private Shape(int value) {
        this.value = value;
    }
};
*/

