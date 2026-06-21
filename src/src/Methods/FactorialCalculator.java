// Faktorial

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd daxil edin:");
        int f = input.nextInt();
        System.out.println(factorial(f));

    }
    public static long factorial(int n) {
        int h=1;
        if (n>0) {
            while (n > 0) {
                h = h * n;
                n = n - 1;
            }
            return h;
        }
        else {
            return -1;
        }

    }
}