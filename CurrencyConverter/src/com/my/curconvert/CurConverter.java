package com.my.curconvert;
import java.util.Scanner;

public class CurConverter {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double usdCourse = scanner.nextDouble();
        System.out.print("Количество рублей: ");
        double rubCount = scanner.nextDouble();
        //System.out.println(" " + convert(usdCourse,rubCount) + " долларов.");
        System.out.format("%s %.2f %s","Итого:",convert(usdCourse,rubCount), "долларов");
    }

    static double convert(double usdCourse, double count){
        return count/usdCourse;
}
}


