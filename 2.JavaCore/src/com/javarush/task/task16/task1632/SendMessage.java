package com.javarush.task.task16.task1632;

public class SendMessage extends Thread implements Message {
    boolean nonStop = true;
    @Override
    public void run() {
        super.run();
        while (nonStop) {

        }
    }

    @Override
    public void showWarning() {
        nonStop = false;
    }
}
