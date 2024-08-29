package com.company.lesson8.task1.vehicles;

import com.company.lesson8.task1.details.Engine;
import com.company.lesson8.task1.professions.Driver;

public class Lorry extends Car{

    private Integer loadCapacity;

    public Lorry(String carBrand, String carClass, Integer carWeight, Driver driver, Engine engine, Integer loadCapacity) {
        super(carBrand, carClass, carWeight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carBrand='" + super.getCarBrand() + '\'' +
                ", carClass='" + super.getCarClass() + '\'' +
                ", carWeight='" + super.getCarWeight() + '\'' +
                ", driver=" + super.getDriver() +
                ", engine=" + super.getEngine() +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
