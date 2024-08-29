package com.company.lesson7.figures;

public class Parallelogram implements Figure{

    int edge1;
    int edge2;

    public Parallelogram(int edge1, int edge2) {
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    @Override
    public double squareCalculation(int height) {
        return edge1*height;
    }

    @Override
    public int perimeterCalculation() {
        return (edge1+edge2)*2;
    }

    @Override
    public int edgeLength() {
        return (edge1+edge2);
    }
}
