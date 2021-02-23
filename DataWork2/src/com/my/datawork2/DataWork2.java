package com.my.datawork2;
import java.util.Scanner;

public class DataWork2 {
    public static void main(String args[]) {

        String ilj = "I like Java!!!";

        if (ilj.contains("Java")) {
            System.out.println("Содержит");
            if (ilj.startsWith("I like")) {
                System.out.println("Начинается");
                if (ilj.endsWith("!!!")) {
                    System.out.println("Заканчивается");
                    System.out.println(ilj.toUpperCase());
                } else {
                    System.out.println("Не заканчивается");
                }
                } else {
                    System.out.println("Не начинается");
                }
            } else {
                    System.out.println("Не содержит");
        }
        String newilj=ilj.replace('a', 'o');
        System.out.println(newilj.substring(7,11));
    }
}
