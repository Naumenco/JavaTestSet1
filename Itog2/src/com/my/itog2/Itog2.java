package com.my.itog2;
import java.util.Scanner;

public class Itog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String s = in.nextLine();
        Integer one;
        Integer two;
        if (s.charAt(0) == 'x') {
            one = Character.getNumericValue(s.charAt(2));
            two = Character.getNumericValue(s.charAt(4));
            if (s.charAt(1) == '+') {
                System.out.println("X = " + (two - one));
            }
            if (s.charAt(1) == '-') {
                System.out.println("X = " + (one + two));
            }
        }
        if (s.charAt(2) == 'x') {
                one = Character.getNumericValue(s.charAt(4));
                two = Character.getNumericValue(s.charAt(0));
            if (s.charAt(1) == '+') {
                    System.out.println("X = " + (one - two));
                }
            if (s.charAt(1) == '-') {
                    System.out.println("X = " + (-(one - two)));
                }
        }
        if (s.charAt(4) == 'x') {
                one = Character.getNumericValue(s.charAt(0));
                two = Character.getNumericValue(s.charAt(2));
                if (s.charAt(1) == '+') {
                    System.out.println("X = " + (one + two));
                }
                if (s.charAt(1) == '-') {
                    System.out.println("X = " + (one - two));
                }
        }
    }
}
