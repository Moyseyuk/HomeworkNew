package com.company.Lesson7.Figures;

public class Trapezoid implements Figure{

    int edge1;
    int edge2;
    int edge3;

    @Override
    public double squareCalculation(int height) {
        return ((double) (edge1 + edge2) /2*height);
    }

    @Override
    public int perimeterCalculation() {
        return (edge1 + edge2 + edge3 * 2);
    }

    @Override
    public int edgeLength() {
        return (edge1 + edge2 + edge3);
    }
}
