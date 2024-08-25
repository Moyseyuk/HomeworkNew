package com.company.Lesson8.task1;

import com.company.Lesson8.task1.details.Engine;
import com.company.Lesson8.task1.professions.Driver;
import com.company.Lesson8.task1.vehicles.Car;
import com.company.Lesson8.task1.vehicles.Lorry;
import com.company.Lesson8.task1.vehicles.SportCar;

public class MainClass {

    public static void main(String[] args) {

        Driver driver = new Driver("Moyseyuk", "Mihail", "Mihailovich", 5.2);
        Engine engine = new Engine(5000, 200);
        Car car = new Car("Mercedes", "Transport", 2000, driver, engine);
        Lorry lorry = new Lorry("Citroen", "Car type", 7000, driver, engine, 5000);
        SportCar sportCar = new SportCar("Mitsubishi", "Lancer", 1500, driver, engine, 320);

        System.out.println(car.toString());
        System.out.println(lorry.toString());
        System.out.println(sportCar.toString());

    }

}
