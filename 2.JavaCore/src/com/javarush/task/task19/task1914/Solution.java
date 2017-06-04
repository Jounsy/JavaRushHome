package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = (outputStream.toString());
        result = result.replaceAll("[\\s]=[\\s\\r\\n]+","");
        int i = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        String znak = "";
        String stroka = "";
        for (String retval : result.split(" ", 3)) {
           if(i==0){a=Integer.parseInt(retval);}
           if(i==1){znak=retval;}
           if(i==2){b=Integer.parseInt(retval);}
           i++;
        }
        if(znak.equals("+")){c=a+b;}
        if(znak.equals("-")){c=a-b;}
        if(znak.equals("*")){c=a*b;}
        result = a+" "+znak+" "+b+" "+"="+" "+c;
            System.setOut(consoleStream);
        System.out.print(result);
    }
    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

