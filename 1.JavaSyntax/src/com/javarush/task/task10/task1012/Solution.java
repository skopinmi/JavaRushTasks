package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int [] count_char = new int [alphabet.size()];
        for (int i = 0; i < alphabet.size(); i++){
            int count = 0;
            for (int ii = 0; ii < list.size(); ii++){
                char [] one_word = list.get(ii).toCharArray();
                for (int iii = 0; iii < one_word.length; iii++) {
                    if (alphabet.get(i) == one_word[iii]) {
                        count++;
                    }
                }
            }
            count_char[i] = count;
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + count_char[i]);
        }

        // напишите тут ваш код
    }
}
