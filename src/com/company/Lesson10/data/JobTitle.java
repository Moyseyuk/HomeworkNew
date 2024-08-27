package com.company.Lesson10.data;

public enum JobTitle {

    DIRECTOR (5),
    WORKER (2);

    private Integer coefficient;

    JobTitle(Integer coefficient) {
        this.coefficient = coefficient;
    }

    public Integer getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
    }
}
