package com.company.lesson14;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Services {

    public static Collection<User> findUserByName(Collection<User> collection, String name) {

        Collection<User> users = new ArrayList<User>();

        for (User t : collection) {
            if(t.getName().equals(name)){
                users.add(t);
            }
        }
        return users;
    }

    public static Collection<User> findUserBySex(Collection<User> collection, SEX sex) {
        Collection<User> users = new ArrayList<User>();

        for (User t : collection) {
            if (t.getSex().equals(sex)){
                users.add(t);
            }
        }
        return users;
    }

}
