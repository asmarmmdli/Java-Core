// Ədədin tək və ya cüt olmasının müəyyən edilməsi

package Variables_Operators;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd daxil edin:");
        int eded = input.nextInt();

        if (eded%2==0) {
            System.out.println(eded + " Cüt ədəddir.");
        }
        else {
            System.out.println(eded + " Tək ədəddir.");
        }




    }
}
