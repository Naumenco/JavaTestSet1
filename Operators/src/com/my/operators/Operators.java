package com.my.operators;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        double res;
        System.out.println("Введите первое целое число: ");
        int firstnumber = in.nextInt();
        System.out.println("Введите второе целое число: ");
        int secondnumber = in.nextInt();
        System.out.println("Введите третье целое число: ");
        int thirdnumber = in.nextInt();
        temp = (firstnumber + secondnumber + thirdnumber) / 3;
        System.out.println(temp);
        res = Math.floor(temp / 2);

        System.out.println(res);

        if (res >= 3) {
            System.out.println("Программа выполнена корректно");

        }
    }
}

