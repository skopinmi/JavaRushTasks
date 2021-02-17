package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
        System.out.println(map.values());
    }

    public static Map<String, Cat> createMap() {
        Map <String, Cat> myMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat(Integer.toString(i));
            String name = "Myo" + i;
            myMap.put(name, cat);//напишите тут ваш код
        }
        return  myMap;//напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> mySet = new HashSet<>(map.values());
        return mySet;//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
