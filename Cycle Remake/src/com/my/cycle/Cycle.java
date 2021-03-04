package com.my.cycle;
import java.util.Scanner;

public class Cycle {

    public static void main(String args[]) {
        final int x = 5;
        final int y = 10;
        final int z = 50;
        boolean checker = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива, разделитель Enter:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println ("Вы ввели:");
        for (int i = 0; i < size; i++) {
            System.out.println (array[i]);
        if ((array[i]==x)|(array[i]==y)|(array[i]==z)) {
           System.out.println("Данное значение имеется в константах");
           break;
        }
        }

    }
}
