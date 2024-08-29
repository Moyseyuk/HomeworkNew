package com.company.lesson8.task2;

import java.util.List;

public class Magazine implements Printable{

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public static void printMagazines(List<Printable> printableList){
        for (Printable printable : printableList){
            if (printable instanceof Magazine){
                printable.print();
            }
        }
    }
}
