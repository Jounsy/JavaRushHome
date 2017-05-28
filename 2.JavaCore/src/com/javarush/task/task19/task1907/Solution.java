package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileRead = reader.readLine();
        reader.close();
        int count = 0;
        BufferedReader readFromFile = new BufferedReader(new FileReader(fileRead));
        String readingString = null;
        while((readingString = readFromFile.readLine())!=null)
        {
            for(String cutString: readingString.split("[\\s\\.\\,\\!\\?]"))
            {
                Pattern pattern = Pattern.compile("[\\.\\,\\!\\?]?[wW][o][r][l][d][\\.\\,\\!\\?]?");   //Регулярное выражение
                Matcher matcher = pattern.matcher(cutString);
                boolean findWorld = matcher.matches();
                if(findWorld)
                {
                   count++;
                }
            }
        }
        readFromFile.close();
        System.out.println(count);
    }
}
