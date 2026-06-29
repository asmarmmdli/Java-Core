// Ədədin 2 və 5-ə bölünmə şərtinin yoxlanması

package Variables_Operators;

import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd daxil edin:");
        int eded =  input.nextInt();

        if (eded%2==0 && eded%5==0) {
            System.out.println("Alma");
        }
        else if (eded%2==0 || eded%5==0) {
            System.out.println("Armud");
        }

        else {

            System.out.println("Bölünmür.");
        }

    }
}
