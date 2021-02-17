package com.my.cycle3;
import java.util.Scanner;

public class Cycle3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int size = input.nextInt();
        double sum=0;
        double array[] = new double[size];
        System.out.println("Введите элементы массива, разделитель Enter:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
            sum+=array[i];
        }

        System.out.println("Эл-ты массива умножается на среднее арифметическое " + sum / size + " :");

        for (int i = 0; i < size; i++) {
            System.out.println(sum / size * array[i]);
        }
        }
    }
