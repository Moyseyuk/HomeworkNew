package com.company.lesson10;

import com.company.lesson10.data.Director;
import com.company.lesson10.data.Worker;
import com.company.lesson10.services.FindByNameInDirectorService;

public class MainClass {

    public static void main(String[] args) {

        //Task 1.  Create 3 workers and director. Print name, surname and salary
        Worker worker1 = new Worker("Andrew", "Knauf", 2);
        Worker worker2 = new Worker("John", "Smith", 5);
        Worker worker3 = new Worker("Joshua", "Smanth", 6);
        Director director1 = new Director("Ann", "Hatuey", 15);

        worker1.printNameSurnameSalary(500);
        worker2.printNameSurnameSalary(500);
        worker3.printNameSurnameSalary(500);
        director1.printNameSurnameSalary(500);

        //Task 2. Assign two created employees under the director's management. Print info about director
        director1.addEmployee(worker1);
        director1.addEmployee(worker2);
        System.out.println(director1);
        director1.printNameSurnameSalary(500);

        //Task3. Create a new director with one employee (under management) and add it under the management of an existing director
        Director director2 = new Director("Anton", "Melnik", 15);
        director2.addEmployee(worker3);
        director1.addEmployee(director2);

        //Task 4. Make sure that the first director's details now include the second one, which is also added to it (and so on).
        System.out.println(director1);
        System.out.println(director2);

        //Task 5. Create a service that determines whether a given director has an employee with a given name subordinate (directly or indirectly) (search deep)
        FindByNameInDirectorService.employeeUnderDirector("John", director1);

    }

}
