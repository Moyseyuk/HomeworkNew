package com.company.lesson15.services;

import com.company.Input;

import java.time.LocalDate;

public class InputDateService {

    public static LocalDate getDate(){

        int inputDay = Input.inputInt("Input Day: ");
        while (inputDay < 1 || inputDay > 31){
            inputDay = Input.inputInt("You input incorrect Day, try again: ");
        }

        int inputMonth = Input.inputInt("Input Month: ");
        while (inputMonth < 1 || inputMonth > 12){
            inputMonth = Input.inputInt("You input incorrect Month, try again: ");
        }

        int inputYear = Input.inputInt("Input Year: ");
        while (inputYear < 1 || inputYear > 3000){
            inputYear = Input.inputInt("You input incorrect Year, try again: ");
        }

        return LocalDate.of(inputYear, inputMonth, inputDay);

    }

}
