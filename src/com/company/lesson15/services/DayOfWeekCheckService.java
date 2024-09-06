package com.company.lesson15.services;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekCheckService {

    public static LocalDate getNextTuesday() {
        LocalDate today = LocalDate.now();

        if (today.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            return today.plusDays(8);
        } else if (today.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
            return today.plusWeeks(1);
        } else if (today.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) {
            return today.plusWeeks(6);
        } else if (today.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
            return today.plusWeeks(5);
        } else if (today.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            return today.plusWeeks(4);
        } else if (today.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            return today.plusWeeks(3);
        } else {
            return today.plusWeeks(2);
        }

    }
}
