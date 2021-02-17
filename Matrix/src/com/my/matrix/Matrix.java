package com.my.matrix;

import java.util.Scanner;

public class Matrix {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива X на Y разделитель Enter:");
        int size1 = input.nextInt();
        int size2 = input.nextInt();
        int array[][] = new int[size1][size2];



        for (int i = 0; i < size1; i++) {
            System.out.println("Введите элементы массива X="+i+"-той строки, разделитель Enter:");
            for (int j = 0; j < size2; j++) {
                array[i][j] = input.nextInt();
            }

        }

        System.out.println("Эл-ты 1-вой строки массива умножается на среднее арифметическое:");

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (i==0) {
                    array[i][j]=array[i][j]*3;
                }
                System.out.print(array[i][j] +"  ");
            }
            System.out.println();
        }
    }
}

