// Maksimum tapmaq

import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üç ədəd daxil edin:");
        int eded1 = input.nextInt();
        int eded2 = input.nextInt();
        int eded3 = input.nextInt();
        System.out.println("Ədədlərin ən böyükü: " + max(eded1,eded2,eded3));
    }
    public static int max(int a, int b, int c) {
        if (a>b && a>c) {
            return a;
        }
        else if (b>c && b>a) {
            return b;
        }
        else {
            return c;
        }
    }
}
