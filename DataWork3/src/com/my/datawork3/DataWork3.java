package com.my.datawork3;
import java.util.Scanner;


public class DataWork3 {

    public static void main(String args[]) {

        String text = "I    love java 8 Я люблю java 14 core1   ";

        int counter = 0;
        text = text.replaceAll("[^a-z A-Z]", "");
        text = text.replaceAll("[\\s]{2,}", " ");

        System.out.println("Получилось:" + text);

        String s[] = text.split(" ");

        for (int i = 0; i < s.length; i++) {
            if (s[i] != " ") {
                counter++;
            }
        }

        System.out.println("Всего английских слов:" + counter);
    }

}

