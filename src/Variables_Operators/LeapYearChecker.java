// Uzun (artıq) il şərtinin yoxlanılması

package Variables_Operators;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İl daxil edin:");
        int il = input.nextInt();
        if ((il % 4 == 0 && il %100!=0) || (il % 400 == 0)) {
            System.out.println(il + " İli şərti ödəyir.");
        }
        else {
            System.out.println(il + " İli şərti ödəmir.");
        }
    }

        }