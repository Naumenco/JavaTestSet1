package com.my.zagadka;
import java.util.Scanner;

public class Zagadka {

    public static void main(String[] args) {
        boolean used = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает:");
        String otvet;
        for (int i = 0; i < 3; i++) {
            otvet = in.nextLine();
            if (otvet.equals("Подсказка"))  {
                if  (i == 0) {
                    used = true;
                    System.out.println("Эта загардка про вирус");
                }else{
                    System.out.println("Подсказка уже недоступна");
                    i--;
                }
            }else if (otvet.equals("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            }else{
               if ((i < 2) & (!used)) {
                   System.out.println("Подумай еще!");
               }
               else {
                   System.out.println("Обидно, приходи в другой раз");
                   break;
               }

            }
        }
    }
}
