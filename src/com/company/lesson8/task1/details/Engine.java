package com.company.lesson8.task1.details;

public class Engine {

    private Integer power;
    private Integer performance;

    public Engine(Integer power, Integer performance) {
        this.power = power;
        this.performance = performance;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", performance=" + performance +
                '}';
    }
}
