// 5 ədədin cəmi, ortası və ən böyüyünün tapılması

import java.util.Scanner;

public class StatisticsFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("5 Ədəd daxil edin:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int cem = a+b+c+d+e;
        double orta = cem/5.0;

        System.out.println("Cəm: " + cem);
        System.out.println("Ədədlərin ədədi ortası: " + orta);

        if (a>b && a>c && a>d && a>e) {
            System.out.println("Ən böyük ədəd: " + a);
        }
        else if (b>a && b>c && b>d && b>e) {
            System.out.println("Ən böyük ədəd: " + b);
        }
        else if (c>a && c>b && c>d && c>e) {
            System.out.println("Ən böyük ədəd: " + c);
        }
        else if (d>a && d>b && d>c && d>e) {
            System.out.println("Ən böyük ədəd: " + d);
        }
        else {
            System.out.println("Ən böyük ədəd: " + e);
        }

    }


}
