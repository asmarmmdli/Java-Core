// Palindrom yoxlaması

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sözü daxil edin:");
        String soz = input.next();
        boolean palindrom = true;
        for(int i =0; i<soz.length()/2; i++) {
            if (soz.charAt(i) != soz.charAt(soz.length()-1-i)) {
                palindrom = false;
                break;
            }
        }
        if (palindrom == true) {
            System.out.println("Daxil etdiyiniz söz palindromdur.");
        }
        else {
            System.out.println("Daxil etdiyiniz söz palindrom deyil.");
        }
    }
}
