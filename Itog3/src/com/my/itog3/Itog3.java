package com.my.itog3;
import java.util.Scanner;

public class Itog3 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int N = input.nextInt();
        int array[][] = new int[1][N];
        String[] s = new String[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Введите " + (i + 1) + "-ую строку, разделитель Enter:");
            s[i] = scan.nextLine();
        }
       /* int N=5; // При отладке не хотелось вводить слова каждый раз
        String s[] = {"привет", "криптоанализ","0123456789",
                "парадокс", "11"}; */
        MaxUniqString(s);
    }
        // Функция для поиска строки с максимумом
        public static void MaxUniqString(String s[])
        {
            int N = s.length;
            int c[] = new int[N];
            boolean cat = false;
            // Индекс строки с максимумом уникальных символов
            int m = 0;
            // перебирать все строки
            for (int j = 0; j < N; j++)
            {
                // ввожу коэффициент равный длинне строки,
                c[j]=s[j].length();
                //иду по строке
                for (int k = 0; k < s[j].length(); k++)
                {   //фиксирую первый символ
                    int x = s[j].charAt(k);
                    //System.out.println("X: "+s[j].charAt(k));
                    // прохожу по строке оставшимися символами
                    for (int i = (k+1); i < s[j].length(); i++) {
                        if ((s[j].charAt(i) == x) & !cat) {
                            // если символы повторяются уменьшаю коэффициент, в случае если такой символ еще не ловился
                            c[j]--;
                            cat=true;
                           // System.out.println("Символ: "+s[j].charAt(i));
                           // System.out.println("Коэффицент: "+ c[j]);
                        };
                      // System.out.println(s[j].charAt(i));
                    } cat=false;
                }
                // отслеживаем максимальное количество уникальных символов, если в следующей строке больше, меняю указатель
                if (c[j] > c[m])
                    m = j;
            }
            System.out.println("Максимумом уникальных символов в солве:" + s[m]);
        }
}
