package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                int number = parseInt(reader.readLine());
                list.add(number);
            }
        } catch (Exception e) {
            for (Integer i : list) {
                System.out.println(i);//напишите тут ваш код
            }
        }
    }
}
