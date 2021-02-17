package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList <Integer> words = new ArrayList<>();
        ArrayList <Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                numbers.add(i);
            } else {
                words.add(i);
            }
        }
        for (int i = 0; i < words.size(); i++) {
            for (int ii = 0; ii < words.size() - 1; ii ++){
                if (isGreaterThan(array[words.get(ii)], array[words.get(ii + 1)])) {
                    String change = array [words.get(ii)];
                    array [words.get(ii)] = array[words.get(ii + 1)];
                    array[words.get(ii + 1)] = change;
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            for (int ii = 0; ii < numbers.size() - 1; ii ++){
                if (Integer.parseInt(array[numbers.get(ii + 1)]) > Integer.parseInt(array[numbers.get(ii)])) {
                    String change = array [numbers.get(ii)];
                    array [numbers.get(ii)] = array[numbers.get(ii + 1)];
                    array[numbers.get(ii + 1)] = change;
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}


