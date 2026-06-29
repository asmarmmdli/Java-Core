// Daxil edilən ədədlərin cəmlənməsi

package Loops_Arrays;

import java.util.Scanner;

public class İnputSummation {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cem = 0;
        int i  = 1;  //dovre girebilsin deye
        while (i != 0) {
            System.out.println("Ədəd daxil edin və ya dayandırmaq üçün 0 daxil edin:");
            i = input.nextInt();
            cem = cem + i;

        }
        System.out.println(cem);

    }
}
