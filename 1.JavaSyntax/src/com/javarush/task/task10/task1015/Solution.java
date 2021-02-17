package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[2];
        ArrayList<String> list_1 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list_1.add(i + " The");//напишите тут ваш код
        }
        ArrayList<String> list_2 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list_2.add(i + " The");//напишите тут ваш код
        }
        list [0] = list_1;
        list [1] = list_2;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}