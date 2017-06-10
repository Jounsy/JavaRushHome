package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];

        Map<String, Double> mapFromFile = new TreeMap<String, Double>();

        String name = null;
        double value = 0.00d;
        boolean inner = false;
        BufferedReader readFromFile = new BufferedReader(new FileReader(fileName));
        String stringFromFile = null;
        while((stringFromFile = readFromFile.readLine())!=null)
        {

            int i = 0;
            for (String str: stringFromFile.split(" "))
            {
                inner = false;
                if(i==0)
                {name = str;}
                else
                {value = Double.parseDouble(str);}
                i++;
            }
            for (Map.Entry<String, Double> entry : mapFromFile.entrySet()) {
                if (name.equals(entry.getKey())) {
                    entry.setValue(entry.getValue() + value);
                    inner = true;
                    break;
                }
            }
            if (!inner) {
                mapFromFile.put(name, value);
            }
        }
        readFromFile.close();
        for (Map.Entry<String, Double> entry : mapFromFile.entrySet())
        {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }

    }
}
