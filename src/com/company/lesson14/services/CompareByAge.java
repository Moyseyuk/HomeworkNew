package com.company.lesson14.services;

import com.company.lesson14.User;

import java.util.Comparator;

public class CompareByAge implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }
}
