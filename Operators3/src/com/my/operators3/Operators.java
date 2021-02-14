package com.my.operators3;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        int secondnumber;
        float thirdnumber;
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        int firstnumber = in.nextInt();
        switch (firstnumber) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - киллограм, 2 - фунт, 3 - пуд: ");
                secondnumber = in.nextInt();
                System.out.println("Введите количество выбранных единиц: ");
                thirdnumber = in.nextFloat();
                switch (secondnumber) {
                    case 1:
                        System.out.println("Киллограмы: " + thirdnumber + "\n Фунты: " + thirdnumber * 2.44+ "\n Пудов: " + thirdnumber * 0.061);
                         break;
                    case 2:
                        System.out.println("Киллограмы: " + thirdnumber * 0.41 + "\n Фунты: " + thirdnumber + "\n Пудов: " + thirdnumber * 0.025);
                        break;
                    case 3:
                        System.out.println("Киллограмы: " + thirdnumber * 16.38 + "\n Фунты: " + thirdnumber * 0.40+ "\n Пудов: " + thirdnumber);
                        break;
                }
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
                secondnumber = in.nextInt();
                System.out.println("Введите количество выбранных единиц: ");
                thirdnumber = in.nextFloat();
                switch (secondnumber) {
                    case 1:
                        System.out.println("Метры: " + thirdnumber + "\n Мили: " + thirdnumber * 0.00062+ "\n Ярды: " + thirdnumber * 1.093 + "\n Футы: " + thirdnumber * 3.28);
                        break;
                    case 2:
                        System.out.println("Метры: " + thirdnumber*1609.34 + "\n Мили: " + thirdnumber + "\n Ярды: " + thirdnumber * 1760 + "\n Футы: " + thirdnumber * 5280);
                        break;
                    case 3:
                        System.out.println("Метры: " + thirdnumber*0.91 + "\n Мили: " + thirdnumber*0.00057 + "\n Ярды: " + thirdnumber + "\n Футы: " + thirdnumber * 3);
                        break;
                    case 4:
                        System.out.println("Метры: " + thirdnumber*0.305 + "\n Мили: " +thirdnumber*0.0002 + "\n Ярды: " + thirdnumber* 0.333+ "\n Футы: " + thirdnumber);
                        break;
                }
                break;

        }


    }
}