package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new NoEnd());
        threads.add(new ExeptionThw());
        threads.add(new Ura());
        threads.add(new SendMessage());
        threads.add(new ConsolReader());
    }
    public static void main(String[] args) {
//        for (int i = 0; i < threads.size(); i++) {
//            threads.get(i).start();
//        }
    }
}