package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileRead = reader.readLine();
        String fileWrite = reader.readLine();
        reader.close();
        String numericString = "";

        BufferedReader readFromFile = new BufferedReader(new FileReader(fileRead));
        BufferedWriter writeToFile = new BufferedWriter(new FileWriter(fileWrite));

        String readingString = null;
        while((readingString = readFromFile.readLine())!=null)
        {
            for(String cutString: readingString.split(" "))
            {
                Pattern pattern = Pattern.compile("[0-9]+");   //Регулярное выражение
                Matcher matcher = pattern.matcher(cutString);
                boolean numeric = matcher.matches();
                if(numeric)
                {
                    numericString += " " + cutString;
                }
            }
        }
        readFromFile.close();
        numericString = numericString.trim();
        writeToFile.write(numericString);
        writeToFile.close();

    }
}
