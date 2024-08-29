package com.company.lesson10.data;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{

    List<Employee> employeeList;

    public Director(String name, String surname, Integer workExperience) {
        super(name, surname, workExperience);
        super.setJobTitle(JobTitle.DIRECTOR);
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public Integer payrollCalculation(Integer baseRate) {
        return super.payrollCalculation(baseRate)*this.employeeList.size();
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", workExperience=" + super.getWorkExperience() +
                ", jobTitle=" + super.getJobTitle() +
                ", employeeList=" + employeeList +
                '}';
    }
}
