package com.javarush.task.task16.task1632;

public class Ura extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Ура");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}
