// Söz dəyişdirmə

package Strings;

import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сümləni daxil edin:");
        String cumle = input.nextLine();
        String yenicumle = cumle.toLowerCase().replace("pis","yaxşı");
        System.out.println("Yeni cümlə: " + yenicumle);
    }
}
