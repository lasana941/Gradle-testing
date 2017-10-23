package com.kodilla.testing.shape;

public class Figures {
    String ShapeName;
    Double Field;

    public Figures(String ShapeName, Double Field) {
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
