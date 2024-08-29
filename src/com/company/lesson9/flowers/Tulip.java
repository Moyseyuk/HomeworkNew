package com.company.lesson9.flowers;

import com.company.lesson9.Flower;

public class Tulip extends Flower {

    private final String type;
    private Integer name;

    public Tulip(String countryOfOrigin, Integer selfLifeInDays, Double price, Integer name) {
        super(countryOfOrigin, selfLifeInDays, price);
        this.type = "Tulip";
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "countryOfOrigin='" + super.getCountryOfOrigin() + '\'' +
                ", selfLifeInDays=" + super.getSelfLifeInDays() +
                ", price=" + super.getPrice() +
                ", type='" + type + '\'' +
                ", name=" + name +
                '}';
    }

}
