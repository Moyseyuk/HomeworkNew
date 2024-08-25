package com.company.Lesson9;

import com.company.Lesson9.flowers.Carnation;
import com.company.Lesson9.flowers.Knapweed;
import com.company.Lesson9.flowers.Rose;
import com.company.Lesson9.flowers.Tulip;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Flower> bouquet1 = new ArrayList<>();
        List<Flower> bouquet2 = new ArrayList<>();
        List<Flower> bouquet3 = new ArrayList<>();

        //Task 9.3
        bouquet1.add(new Carnation("France", 10, 2.50, 1));
        bouquet2.add(new Carnation("France", 10, 2.50, 2));
        bouquet3.add(new Carnation("France", 10, 2.50, 3));
        bouquet1.add(new Knapweed("Germany", 12, 3.10, 1));
        bouquet2.add(new Knapweed("Germany", 12, 3.10, 2));
        bouquet3.add(new Knapweed("Germany", 12, 3.10, 3));
        bouquet1.add(new Rose("Italy", 8, 1.50, 1));
        bouquet2.add(new Rose("Italy", 8, 1.50, 2));
        bouquet3.add(new Rose("Italy", 8, 1.50, 3));
        bouquet1.add(new Tulip("Belgium", 7, 2.30, 1));
        bouquet2.add(new Tulip("Belgium", 7, 2.30, 2));
        bouquet3.add(new Tulip("Belgium", 7, 2.30, 3));

        System.out.println(new DecimalFormat("#.##").format(getBouquetPrice(bouquet1)));
        System.out.println(new DecimalFormat("#.##").format(getBouquetPrice(bouquet2)));
        System.out.println(new DecimalFormat("#.##").format(getBouquetPrice(bouquet3)));

        //Task 9.4
        int counterOfSellingFlowers = 0;
        for (Flower flower : bouquet1){
            counterOfSellingFlowers++;
        }
        for (Flower flower : bouquet2){
            counterOfSellingFlowers++;
        }
        for (Flower flower : bouquet3){
            counterOfSellingFlowers++;
        }
        System.out.println("Number of flowers sold: " + counterOfSellingFlowers);
    }

    //Method for Task 9.3
    public static Double getBouquetPrice(List<Flower> flowers){
        double price = 0.0;
        for (Flower flower : flowers){
            price = price + flower.getPrice();
        }
        return price;
    }

}
