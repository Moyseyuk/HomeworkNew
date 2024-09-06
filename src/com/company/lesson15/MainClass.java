package com.company.lesson15;

import com.company.Input;
import com.company.lesson15.services.DayOfWeekCheckService;
import com.company.lesson15.services.InputDateService;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MainClass {

    public static void main(String[] args) {


        //Task 1. Program for output day of week by date.
        System.out.println(InputDateService.getDate().getDayOfWeek());

        //Task 2. Program for output next tuesday from today.
        System.out.println(DayOfWeekCheckService.getNextTuesday());

        //Task3. Lambda
        int inputValue = Input.inputInt("Input 1 or 2:");
        Integer number = null;
        String string = null;
        while (inputValue != 1 && inputValue != 2) {
            inputValue = Input.inputInt("Incorrect. Input 1 or 2:");
        }

        if (inputValue == 1) {
            string = Input.inputString("Input string for reverse:");
        } else {
            number = Input.inputInt("Input number for factorial:");
        }

        MyFunctionalInterfaceImpl myFunctionalInterfaceImpl = new MyFunctionalInterfaceImpl();

        if (inputValue == 1){
            System.out.println(myFunctionalInterfaceImpl.process(string, ob -> {
                    return new StringBuilder(String.valueOf(ob)).reverse().toString();
            }));
        } else {
            System.out.println(myFunctionalInterfaceImpl.process(number, ob -> {
                int result = 1;
                for (int counter = 1; counter <= (Integer)ob; counter++) {
                    result = result * counter;
                }
                return result;
            }));
        }

    }

}
