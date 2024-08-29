package com.company.lesson8.task2;

import java.util.List;

public class Book implements Printable{

    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public static void printBooks (List<Printable> printableList){
        for (Printable printable : printableList){
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
