package com.company.lesson8.task1.vehicles;

import com.company.lesson8.task1.details.Engine;
import com.company.lesson8.task1.professions.Driver;

public class Car {

    private String carBrand;
    private String carClass;
    private Integer carWeight;
    private Driver driver;
    private Engine engine;

    public Car(String carBrand, String carClass, Integer carWeight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Integer getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(Integer carWeight) {
        this.carWeight = carWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void turnRight(){
        System.out.println("Turn right");
    }

    public void turnLeft(){
        System.out.println("Turn left");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", carWeight='" + carWeight + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
