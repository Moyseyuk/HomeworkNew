package com.company.lesson10.data;

public abstract class Employee {

    private String name;
    private String surname;
    private Integer workExperience;
    private JobTitle jobTitle;

    public Employee(String name, String surname, Integer workExperience) {
        this.name = name;
        this.surname = surname;
        this.workExperience = workExperience;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public Integer payrollCalculation(Integer baseRate){
        return baseRate * workExperience* jobTitle.getCoefficient();
    }

    public void printNameSurnameSalary(Integer baseRate){
        System.out.println("Name: " + name + " Surname: " + surname + " Salary: " + payrollCalculation(baseRate));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workExperience=" + workExperience +
                ", jobTitle=" + jobTitle +
                '}';
    }
}
