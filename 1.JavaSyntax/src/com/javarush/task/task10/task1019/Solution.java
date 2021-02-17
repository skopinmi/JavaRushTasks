package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*  private static Integer id;
    private static String name;
    private static HashMap <String, Integer> map;
    public static void main(String[] args) throws IOException {
        String read;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        map = new HashMap<>();
        boolean i = true;
        while (i) {
            read = reader.readLine();
            if (read == "")  i = false;
            else {
                id = Integer.parseInt(read);
                name = reader.readLine();
                map.put(name, id);
            }
        }

        for (Map.Entry<String, Integer> pair: map.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.print( key + " " + value);
        }*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap <String, Integer> map = new HashMap<>();
        while (true) {
            String input = reader.readLine();
            if (input.equals("")) break;
            else {
                int id = Integer.parseInt(input);
                String name = reader.readLine();
                map.put(name, id);
            }
        }


        for (Map.Entry<String, Integer> pair: map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(value + " " + key);
        }
    }
}
