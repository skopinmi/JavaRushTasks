package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        while (list.size() > 0) {
            String word = list.get(0);
            list.remove(0);
            Integer count = 1;
            for (int ii = 0; ii < list.size(); ii++) {
                String outputWord = list.get(ii);
                if (word.equals(outputWord)) {
                    count++;
                    list.remove(ii);
                    ii--;
                }
            }
            result.put(word, count);
        }
        return result;
    }

}

