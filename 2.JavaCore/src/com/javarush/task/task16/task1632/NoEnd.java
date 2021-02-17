package com.javarush.task.task16.task1632;

public class NoEnd extends Thread {
    @Override
    public void run() {
        try {
            while (true) {

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
