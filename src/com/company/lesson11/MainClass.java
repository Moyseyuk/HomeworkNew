package com.company.lesson11;

import com.company.Input;
import com.company.lesson11.dto.Storage;
import com.company.lesson11.exceptions.DataException;

public class MainClass {

    public static void main(String[] args) {

        Storage storage = new Storage();

        String string = Input.inputString("Input string");

        while (!string.equals("exit")) {
            if (string.equals("get")){
                try {
                    System.out.println(storage.getElement());
                } catch (DataException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                try {
                    storage.setElement(string);
                } catch (DataException e) {
                    System.out.println(e.getMessage());
                }
            }
            string = Input.inputString("Input string:");
        }

    }

}
