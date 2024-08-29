package com.company.lesson8.task1.vehicles;

import com.company.lesson8.task1.details.Engine;
import com.company.lesson8.task1.professions.Driver;

public class SportCar extends Car{

    private Integer maxSpeed;

    public SportCar(String carBrand, String carClass, Integer carWeight, Driver driver, Engine engine, Integer maxSpeed) {
        super(carBrand, carClass, carWeight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carBrand='" + super.getCarBrand() + '\'' +
                ", carClass='" + super.getCarClass() + '\'' +
                ", carWeight='" + super.getCarWeight() + '\'' +
                ", driver=" + super.getDriver() +
                ", engine=" + super.getEngine() +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
