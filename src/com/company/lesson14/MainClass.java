package com.company.lesson14;

import com.company.lesson14.services.CompareByAge;
import com.company.lesson14.services.Services;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        List<User> userList = new LinkedList<User>();
        Set<User> userSet = new HashSet<>();

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

        //Sort List and Set by age
        userList.sort(new CompareByAge());
        System.out.println(userList);
        System.out.println(userSet);

        //Find the number in an array that has the greatest number of repetitions
        int[] array = {5, 1, 6, 4, 4, 2, 5, 2, 5, 4};
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }

        int maxValueMap = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueMap) {
                System.out.println("Max value is: " + entry.getKey());
            }
        }


    }

}
