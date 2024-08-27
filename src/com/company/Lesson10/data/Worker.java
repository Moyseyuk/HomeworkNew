package com.company.Lesson10.data;

public class Worker extends Employee{

    public Worker(String name, String surname, Integer workExperience) {
        super(name, surname, workExperience);
        super.setJobTitle(JobTitle.WORKER);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", workExperience=" + super.getWorkExperience() +
                ", jobTitle=" + super.getJobTitle() +
                '}';
    }
}
