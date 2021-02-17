package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsolReader extends Thread {
    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            boolean doIt = true;
            while (doIt) {
                String a = reader.readLine();
                if (a.equals("N")) break;
                sum += Integer.parseInt(a);
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
