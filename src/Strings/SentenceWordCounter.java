// Cümlədəki söz sayı

package Strings;

import java.util.Scanner;

public class SentenceWordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cümləni daxil edin:");
        String cumle = input.nextLine();
        String[] sozler = cumle.split(" ");
        System.out.println("Söz sayı: " + sozler.length);
        for (String i: sozler) {
            System.out.println(i);
        }

    }
}
