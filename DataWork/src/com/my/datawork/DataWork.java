package com.my.datawork;
import java.util.Scanner;

public class DataWork {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число, оно станет текстом: ");
        String textvalue = input.next();
        System.out.println("Введите число, оно станет Int: ");
        int intvalue = input.nextInt();
        Integer newint= new Integer(textvalue);
        int resultInt = Math.max(intvalue,  newint);
        double resultmin = Math.min(intvalue,  newint);

        System.out.println("Большее значение:" + resultInt +" Меньшее:"+ resultmin);
    }
}