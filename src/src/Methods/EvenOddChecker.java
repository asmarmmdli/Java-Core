// Cüt yoxlaması

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=1; i<=5; i++) {
            System.out.println("Ədəd daxil edin:");
            int k = input.nextInt();
            if (isEven(k)==true) {
                System.out.println("Daxil etdiyiniz ədəd cüt ədəddir.");
                System.out.println();
            }
            else {
                System.out.println("Daxil etdiyiniz ədəd tək ədəddir.");
                System.out.println();
            }
        }

    }
    public static boolean isEven(int eded){
        if (eded%2==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
