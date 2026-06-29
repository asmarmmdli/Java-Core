// Alt sətir çıxarmaq

package Strings;

import java.util.Scanner;

public class SubstringExtractor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sözü daxil edin:");
        String soz = input.next();
        int son = soz.length() - 1; //son indexi tapmaq üçün
        System.out.println("Ilk 3 simvolu: " + soz.substring(0, 3));
        System.out.println("Son 3 simvolu " + soz.substring(son - 2));

    }
}
