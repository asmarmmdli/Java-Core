// Sətrin uzunluğu

import java.util.Scanner;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sözü daxil edin:");
        String soz = input.next();
        if (soz.length()>5) {
            System.out.println(soz.length() + " simvol: Uzun söz");
        }
        else {
            System.out.println(soz.length() + " simvol: Qısa söz");
        }

    }
}
