package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        FileInputStream in = new FileInputStream(file);
        int min = Integer.MAX_VALUE;

        while (in.available() > 0) {
            int now = in.read();
            if (min > now) {
                min = now;
            }
        }
        System.out.println(min);
        in.close();
        reader.close();
    }
}
