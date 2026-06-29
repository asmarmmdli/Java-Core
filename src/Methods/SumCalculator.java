// Toplama metodu

package Methods;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("iki ədəd daxil edin:");
        int eded1 = input.nextInt();
        int eded2 = input.nextInt();
        System.out.println("Ədədlərin cəmi: " + add(eded1,eded2));
    }

    public static int add(int a, int b){
        return a+b;

    }
}