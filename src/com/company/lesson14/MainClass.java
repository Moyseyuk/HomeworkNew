package com.company.lesson14;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        Set<User> userSet = new TreeSet<>();

        User user1 = new User("Anna", 20, SEX.FEMALE);
        User user2 = new User("Gleb", 30, SEX.MALE);
        User user3 = new User("Fedor", 20, SEX.MALE);
        User user4 = new User("Gleb", 40, SEX.MALE);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);

        System.out.println(userList);
        System.out.println(userSet);

        //Find user by name in collection
        System.out.println(Services.findUserByName(userList, "Anna"));
        System.out.println(Services.findUserByName(userSet, "Gleb"));

        //Find user by sex
        System.out.println(Services.findUserBySex(userList, SEX.MALE));
        System.out.println(Services.findUserBySex(userSet, SEX.FEMALE));

    }

}
