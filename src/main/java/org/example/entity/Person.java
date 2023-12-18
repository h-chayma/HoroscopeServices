package org.example.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    String name;
    String date;

    public Person(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public Person() {
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getDay() {
        return extractComponent(date, "dd");
    }

    public int getMonth() {
        return extractComponent(date, "MM");
    }

    public int getYear() {
        return extractComponent(date, "yyyy");
    }

    private int extractComponent(String dateString, String pattern) {
        try {
            Date parsedDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            String componentStr = dateFormat.format(parsedDate);
            return Integer.parseInt(componentStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
