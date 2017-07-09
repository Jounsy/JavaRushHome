package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] peopleCount = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 15; i++){
            peopleCount[i] = Integer.parseInt(reader.readLine());
        }
        if(summaChetHome(peopleCount)>summaNeChetHome(peopleCount)){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }


        //напишите тут ваш код
    }
    static int summaChetHome(int[] peopleCount){
        int countPeople = 0;
        for(int i = 0; i < 15; i++){
            if(i%2==0 || i == 0){
                countPeople += peopleCount[i];
            }
        }
        return countPeople;
    }
    static int summaNeChetHome(int[] peopleCount){
        int countPeople = 0;
        for(int i = 0; i < 15; i++){
            if(i%2!=0){
                countPeople += peopleCount[i];
            }
        }
        return countPeople;
    }
}
