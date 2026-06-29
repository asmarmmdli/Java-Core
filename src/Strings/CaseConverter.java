// Böyük/Kiçik hərflər

package Strings;

import java.util.Scanner;
public class CaseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сümlə daxil edin:");
        String cumle = input.nextLine();
        System.out.println(cumle.toUpperCase());
        System.out.println(cumle.toLowerCase());

    }
}
