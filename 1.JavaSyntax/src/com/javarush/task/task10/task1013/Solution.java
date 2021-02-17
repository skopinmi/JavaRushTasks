package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private String family;
        private int id;
        private  String nationality;

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(String name, String family, int age, boolean sex,  int id, String nationality) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.family = family;
            this.id = id;
            this.nationality = nationality;
        }

        public Human(String name, int age, boolean sex, String family, String nationality) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.family = family;
            this.nationality = nationality;
        }

        public Human(String name, int age, boolean sex, String family, int id) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.family = family;
            this.id = id;
        }

        public Human(String name, int age, boolean sex, String family) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.family = family;
        }

        public Human() {
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex, String family, String nationality) {
            this.name = name;
            this.sex = sex;
            this.family = family;
            this.nationality = nationality;
        }

        public Human(String nationality) {
            this.nationality = nationality;
        }

        public Human(boolean sex, String nationality) {
            this.sex = sex;
            this.nationality = nationality;
        }

        // Напишите тут ваши переменные и конструкторы
    }
}
