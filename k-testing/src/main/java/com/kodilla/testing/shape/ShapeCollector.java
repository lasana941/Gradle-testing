package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figure = new ArrayList<>();
    String circle = "circle";
    String square = "square";
    String triangle = "triangle";
    public boolean addFigure(Shape shape) {
        if(!shape.getShapeName().equals(square)
                && !shape.getShapeName().equals(triangle)
                && !shape.getShapeName().equals(circle)){
            return false;
        }
        System.out.println(shape.getShapeName());
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
