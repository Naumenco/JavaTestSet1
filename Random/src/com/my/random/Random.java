package com.my.random;

import java.util.Scanner;

public class Random {
    public static void main(String args[]) {

        java.util.Random random = new java.util.Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: "); // Можно сделать 15, как по заданию, то тогда часто попадают [20; -20], 3 .. 5 интереснее.
        int size = input.nextInt();
        int array[] = new int[size];
        int maximum = 0;
        int minimum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = (random.nextInt(41) - 20); // 0; - если заполнить 0-ми, то прикольно.
            switch (i) {
                case 0: {
                    maximum = array[i];
                    minimum = array[i];
                }
            }
            if (maximum < array[i]) {
                maximum = array[i];
            }
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        System.out.println("Вы ввели:");

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Максимум: " + maximum + " Минимум: " + minimum);
        System.out.println("Значение максимума по модулю: " + Math.max((Math.abs(maximum)),  Math.abs(minimum)));

        if (Math.abs(maximum) > Math.abs(minimum)) {
            System.out.println("Максимум по модулю больше минимума");
        } else if (Math.abs(maximum) < Math.abs(minimum)) {
            System.out.println("Минимум по модулю больше маскимума");
        } else {
            System.out.println("SubZero");
        }
    }

}
