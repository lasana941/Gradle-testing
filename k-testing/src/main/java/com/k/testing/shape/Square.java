package com.k.testing.shape;

import com.k.testing.shape.Shape;

public class Square implements Shape {
    private String shapeName;
    private Double xSide;
    private Double ySide;

    public Square(String ShapeName, Double xSide, Double ySide) {
        this.shapeName = ShapeName;
        this.xSide = xSide;
        this.ySide = ySide;
    }
    public String getShapeName() {
        return shapeName;
    }
    public Double getField() {
        return xSide * ySide;
    }
}
