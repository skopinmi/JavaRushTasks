package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try
        {
            divideByZero();
        }
        catch (Exception e)
        {
     //       printStackTrace(e);
            e.printStackTrace();
        }
    }

    public static void divideByZero()
    {
        int q = 10 /0;
        System.out.println( q );
    }

/*    public static void printStackTrace(Throwable throwable)
    {
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }*/
}
