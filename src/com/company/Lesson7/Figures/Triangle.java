package com.company.Lesson7.Figures;

public class Triangle implements Figure{

    int edge1;
    int edge2;
    int edge3;

    public Triangle(int edge1, int edge2, int edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    @Override
    public double squareCalculation(int height) {
        return (double) (edge1 * height) /2;
    }

    @Override
    public int perimeterCalculation() {
        return edge1+edge2+edge3;
    }

    @Override
    public int edgeLength() {
        return edge1+edge2+edge3;
    }
}
