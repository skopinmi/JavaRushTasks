package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        FileInputStream in = new FileInputStream(file);
        int max = 0;
        int now;
        while ((now = in.read()) > -1) {
            if (max < now) {
                max = now;
            }
        }
        System.out.println(max);
        in.close();
        reader.close();
    }
}
