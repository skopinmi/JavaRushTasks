package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static  BufferedReader reader;
    static {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        public File file;
        public String fileBody = "";

        @Override
        public void setFileName(String fullFileName) {
            file = new File(fullFileName);
        }

        @Override
        public void run() {
            super.run();
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    fileBody += (scanner.nextLine() + " ");
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

        @Override
        public String getFileContent() {
            return fileBody;
        }
    }
}
