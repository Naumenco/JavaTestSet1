package com.my.operators2;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float firstnumber = in.nextFloat();
        System.out.println("Введите второе число: ");
        float secondnumber = in.nextFloat();
        System.out.println("Введите Операцию (+,-,*,/): ");
        char operation = in.next().charAt(0);

        if (operation == '+') {
            System.out.println("Результат: " + (firstnumber + secondnumber));
        }
        else if (operation == '-') {
            System.out.println("Должно быть:" + (firstnumber - secondnumber));
        }
        else if (operation == '*') {
            System.out.println("Должно быть:" + (firstnumber * secondnumber));
        }
        else if (operation == '/') {
            System.out.println("Должно быть:" + (firstnumber / secondnumber));

        }
    }
}
