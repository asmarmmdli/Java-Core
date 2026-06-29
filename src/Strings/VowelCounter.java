// Sait hərflərin sayı

package Strings;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cümlə daxil edin:");
        String cumle = input.nextLine();
        int say = 0;
        for(int i=0; i<cumle.length(); i++) {
            char herf = cumle.toLowerCase().charAt(i);
            if (herf == 'a' || herf == 'ı' || herf == 'ə' || herf == 'o' || herf == 'i' || herf == 'u' || herf == 'ö' ||
                    herf == 'e' || herf == 'ü') {
                say = say + 1;
            }
        }
        System.out.println("Sait sayı: " + say);
    }
}
