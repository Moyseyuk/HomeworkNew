package com.company.lesson11.dto;

import com.company.lesson11.exceptions.DataException;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<String> strings;

    public Storage() {
        this.strings = new ArrayList<>();
    }

    public String getElement() throws DataException {
        if (strings.isEmpty()){
            throw new DataException("List is empty, enter data");
        } else {
            String element = strings.get(0);
            strings.remove(0);
            return element;
        }
    }

    public void setElement(String data) throws DataException {
        if (strings.size() < 5) {
            this.strings.add(data);
        } else {
            throw new DataException("Get data or exit, list is full");
        }
    }

}

