package com.company.lesson6;

import com.company.Input;

public class Calculation {

    public static void main(String[] args) {

        Vector vector1 = new Vector(Input.inputInt("Insert first point of first vector:"),
                Input.inputInt("Insert second point of first vector:"),
                Input.inputInt("Insert third point of first vector:"));
        Vector vector2 = new Vector(Input.inputInt("Insert first point of second vector:"),
                Input.inputInt("Insert second point of second vector:"),
                Input.inputInt("Insert third point of second vector:"));

        System.out.println("Vector length: " + vectorLength(vector1));
        System.out.println("Vectors dotProduct: " + dotProduct(vector1, vector2));
        System.out.println("Vectors product: " + vectorProduct(vector1, vector2).toString());
        System.out.println("Cosine of angle from vectors: " + cosAngle(vector1, vector2));
        System.out.println("Sum of vectors: " + vectorsSum(vector1, vector2));
        System.out.println("Subtraction of vectors: " + vectorSub(vector1, vector2));

    }

    public static double vectorLength(Vector vector){
        return Math.sqrt((vector.getX()*vector.getX()) +
                (vector.getY()* vector.getY()) +
                (vector.getZ())* vector.getZ());
    }

    public static int dotProduct(Vector vector1, Vector vector2){
        return ((vector1.getX()*vector2.getX()) +
                (vector1.getY()*vector2.getY()) +
                (vector1.getZ()*vector2.getZ()));
    }

    public static Vector vectorProduct(Vector vector1, Vector vector2){
        return new Vector((vector1.getY()*vector2.getZ()) - (vector1.getZ()*vector2.getY()),
                (vector1.getZ()*vector2.getX()) - (vector1.getX()*vector2.getZ()),
                (vector1.getX()*vector2.getY()) - (vector1.getY()*vector2.getX()));
    }

    public static double cosAngle(Vector vector1, Vector vector2){
        return (dotProduct(vector1, vector2)/(Math.abs(vectorLength(vector1))*Math.abs(vectorLength(vector2))));
    }

    public static Vector vectorsSum(Vector vector1, Vector vector2){
        return new Vector(vector1.getX() + vector2.getX(),
                vector1.getY() + vector2.getY(),
                vector1.getZ() + vector2.getZ());
    }

    public static Vector vectorSub(Vector vector1, Vector vector2){
        return new Vector(vector1.getX() - vector2.getX(),
                vector1.getY() - vector2.getY(),
                vector1.getZ() - vector2.getZ());
    }

}
