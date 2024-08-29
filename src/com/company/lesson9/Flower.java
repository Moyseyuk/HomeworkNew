package com.company.lesson9;

public class Flower {

    private String countryOfOrigin;
    private Integer selfLifeInDays;
    private Double price;

    public Flower(String countryOfOrigin, Integer selfLifeInDays, Double price) {
        this.countryOfOrigin = countryOfOrigin;
        this.selfLifeInDays = selfLifeInDays;
        this.price = price;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Integer getSelfLifeInDays() {
        return selfLifeInDays;
    }

    public void setSelfLifeInDays(Integer selfLifeInDays) {
        this.selfLifeInDays = selfLifeInDays;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "countryOfOrigin='" + countryOfOrigin + '\'' +
                ", selfLifeInDays=" + selfLifeInDays +
                ", price=" + price +
                '}';
    }
}
