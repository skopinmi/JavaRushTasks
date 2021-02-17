package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
. Внутри класса Solution создай интерфейс public interface CanFly(летать) с методом void fly().
2. Внутри класса Solution создай интерфейс public interface CanClimb(лазить по деревьям) с методом void climb().
3. Внутри класса Solution создай интерфейс public interface CanRun(бегать) с методом void run().
4. Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
5. Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).


*/

public class Solution {

    public static void main(String[] args) {

    }
    interface CanFly {
        void fly();
    }
    interface CanClimb {
        void climb();
    }
    interface CanRun {
        void run();
    }

    public class Cat implements CanRun, CanClimb {
        public void run() {}
        public void climb() {}
    }

    public class Dog implements CanRun{
        public void run() {}
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanFly, CanRun{
        public void run() {}
        public void fly() {}
    }
}
