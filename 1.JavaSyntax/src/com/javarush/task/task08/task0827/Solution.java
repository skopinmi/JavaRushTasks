package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date0 = new Date(date);
        Date date1 = new Date(0);
        date1.setYear(date0.getYear());
        date1.setDate(1);
        date1.setMonth(0);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);
        System.out.println(date1);
        long time = date0.getTime() - date1.getTime() + 86400000;
        boolean a = true;
        if (time%(2*86400000) == 0) { a = false;}
        return a;
    }
}
