package com.company.lesson15;

public class MyFunctionalInterfaceImpl {

    Object process (Object value, MyFunctionalInterface myFunction){
        return myFunction.process(value);
    }

}
