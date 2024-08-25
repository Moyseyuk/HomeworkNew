package com.company.Lesson9.flowers;

import com.company.Lesson9.Flower;

public class Carnation extends Flower {

    private final String type;
    private Integer name;

    public Carnation(String countryOfOrigin, Integer selfLifeInDays, Double price, Integer name) {
        super(countryOfOrigin, selfLifeInDays, price);
        this.type = "Carnation";
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
        return "Carnation{" +
                "countryOfOrigin='" + super.getCountryOfOrigin() + '\'' +
                ", selfLifeInDays=" + super.getSelfLifeInDays() +
                ", price=" + super.getPrice() +
                ", type='" + type + '\'' +
                ", name=" + name +
                '}';
    }
}
