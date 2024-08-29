package com.company.lesson8.task1.professions;

import com.company.lesson8.task1.common.Person;

public class Driver extends Person {

    private Double drivingExperience;

    public Driver(String surname, String name, String patronymic, Double drivingExperience) {
        super(surname, name, patronymic);
        this.drivingExperience = drivingExperience;
    }

    public Double getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(Double drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "surname='" + super.getSurname() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", drivingExperience=" + drivingExperience + '\'' +
                '}';
    }
}
