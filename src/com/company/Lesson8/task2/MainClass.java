package com.company.Lesson8.task2;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<Printable> printableList = new ArrayList<>();
        printableList.add(new Book("Book 1"));
        printableList.add(new Magazine("Magazine 1"));
        printableList.add(new Book("Book 2"));
        printableList.add(new Magazine("Magazine 2"));

        for (Printable printable : printableList){
            printable.print();
        }

        System.out.println("========= Print Books =========");
        Book.printBooks(printableList);

        System.out.println("========= Print Magazines =========");
        Magazine.printMagazines(printableList);

    }



}
