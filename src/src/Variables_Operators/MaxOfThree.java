// 3 ədəd arasından ən böyüyünün tapılması

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üç ədəd daxil edin:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a>b && a>c) {
            System.out.println("Ən böyük ədəd: " + a);
        }
        else if (b>c && b>a) {
            System.out.println("Ən böyük ədəd: " + b);
        }
        else {
            System.out.println("Ən böyük ədəd: " + c);
        }
    }
}
