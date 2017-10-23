package com.kodilla.testing.shape;

import static java.lang.Math.*;

public class Triangle implements Shape {
    private String shapeName;
    private Double aSide;
    private Double bSide;
    private Double cSide;

    public Triangle(String ShapeName, Double aSide, Double bSide, Double cSide) {
        this.shapeName = ShapeName;
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }
    public String getShapeName() {
        return shapeName;
    }
    public Double getField() {
        Double semiperimeter = 0.5 *(aSide + bSide + cSide);
        return sqrt(semiperimeter *(semiperimeter - aSide) * (semiperimeter - bSide) * (semiperimeter - cSide));
    }
}
