package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String name = "";
        switch (o.getClass().getSimpleName()) {
            case ("Cat"):
                name = "Кошка";
                break;
            case ("Bird"):
                name = "Птица";
                break;
            case ("Lamp"):
                name = "Лампа";
                break;
            case ("Dog"):
                name = "Собака";
                break;
        }
        System.out.println(name);//Напишите тут ваше решение
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
