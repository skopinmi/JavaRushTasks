package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String dateString = reader.readLine();
           SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
           SimpleDateFormat date2 = new SimpleDateFormat("MMM dd, yyyy", new Locale("EN"));
           Date dateNew = date.parse(dateString);
           String d = date2.format(dateNew);
           System.out.println(d.toUpperCase());
    }
}
