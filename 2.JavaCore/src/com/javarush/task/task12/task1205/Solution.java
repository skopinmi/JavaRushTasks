package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        long a = System.nanoTime();
        String name = "";
        switch (o.getClass().getSimpleName()) {
            case ("Cow"):
                name = "Корова";
                break;
            case ("Whale"):
                name = "Кит";
                break;
            case ("Dog"):
                name = "Собака";
                break;
            default: name = "Неизвестное животное";
        }
        System.out.println((System.nanoTime() - a) * 0.000000001f);//Напишите тут ваше решение
//        проба с instanceof
//      String nameclass = o.get
//        if (o instanceof Cow)
//
//
//
//
//      return
        return name;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
