package com.my.cycle2;
import java.util.Scanner;


public class Cycle2 {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите любое целое число:");

        int N = scan.nextInt();
        System.out.println("Сумма не четных: " + sumDigit(N));
    }

    public static int sumDigit(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
            sum += i;
            System.out.println (i + " добавляем в итоге: " + sum);}
        }
        return sum;


    }
}
