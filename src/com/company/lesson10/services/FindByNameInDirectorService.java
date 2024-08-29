package com.company.lesson10.services;

import com.company.lesson10.data.Director;
import com.company.lesson10.data.Employee;
import com.company.lesson10.data.JobTitle;

public abstract class FindByNameInDirectorService {

    private static boolean result = false;

    public static void employeeUnderDirector(String name, Director director) {
        calculation(name, director);
        if (result == true){
            System.out.println(name + " reports to this director");
        } else {
            System.out.println(name + " not reports to this director");
        }
    }

    public static void calculation(String name, Director director) {
        for (Employee employee : director.getEmployeeList()) {
            if (employee.getJobTitle().equals(JobTitle.DIRECTOR)) {
                calculation(name, (Director) employee);
            }else {
                if (employee.getName().equals(name)) {
                    result = true;
                }
            }
        }
    }

}
