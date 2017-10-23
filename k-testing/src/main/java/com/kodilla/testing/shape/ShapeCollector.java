package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figure = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        if(shape == null){
            return false;
        }
        System.out.println("Shape named: " + shape.getShapeName() + " added to the list.");
        figure.add(shape);
        return true;
    }

    public Shape getFigure(int n) {
        if (figure.size() < n){
            return null;
        }
        if (figure.isEmpty()){
            return null;
        }
        return figure.get(n);
    }
    public boolean removeFigure(Shape shape){
        if (figure.isEmpty()){
            return false;
        }
        figure.remove(shape);
        return true;
    }
}
