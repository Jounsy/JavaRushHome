package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        String fileName =args[0];

        String name;
        Integer day = null;
        Integer month = null;
        Integer year = null;

        BufferedReader readFromFile = new BufferedReader(new FileReader(fileName));
        String stringFromFile = null;
        while((stringFromFile = readFromFile.readLine())!=null)
        {
            name = "";
            int i = 0;
            for (String str: stringFromFile.split(" "))
            {

                if(str.matches("[^0-9]+"))
                {name = name + " " + str;}
                else
                {
                    if(i==0){day = Integer.parseInt(str);}
                    if(i==1){month = Integer.parseInt(str);}
                    if(i==2){year = Integer.parseInt(str);}
                    i++;
                }

            }
            String str_date=day+"-"+month+"-"+year;
            SimpleDateFormat formatter;
            Date date ;
            formatter = new SimpleDateFormat("dd-MM-yyyy");
            date = formatter.parse(str_date);
            PEOPLE.add(new Person(name.trim(),date));

        }
        readFromFile.close();

    }
}
