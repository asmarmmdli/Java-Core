// Daxil edilən ədədin faktorialının tapılması

import java.util.Scanner;

public class FactorialCalculator1 {
    public static void main(String[] args) {
        int f = 1;
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        for (; i>= 1; i--) {
            f = f * i;
        }
        System.out.println("Faktorialı: " + f);
    }
}
