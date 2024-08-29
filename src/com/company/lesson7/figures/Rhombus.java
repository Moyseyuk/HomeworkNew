package com.company.lesson7.figures;

public class Rhombus implements Figure{

    int edge;

    public Rhombus(int edge) {
        this.edge = edge;
    }

    @Override
    public double squareCalculation(int height) {
        return edge*height;
    }

    @Override
    public int perimeterCalculation() {
        return edge*4;
    }

    @Override
    public int edgeLength() {
        return edge*2;
    }
}
