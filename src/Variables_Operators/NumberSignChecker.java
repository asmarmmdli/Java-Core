// Ədədin işarəsinin yoxlanması

package Variables_Operators;

import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd daxil edin:");
        int eded = input.nextInt();
        if (eded>0) {
            System.out.println(eded + " Müsbət ədəddir.");
        }
        else if (eded<0) {
            System.out.println(eded + " Mənfi ədəddir.");
        }
        else {
            System.out.println("Ədəd sıfıra bərabərdir");
        }


    }
}
