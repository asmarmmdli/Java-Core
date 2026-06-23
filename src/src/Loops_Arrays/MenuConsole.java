// Dövrü istifadəçi menyusu

import java.util.Scanner;

public class MenuConsole {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char secim;
        do {
            System.out.println("1 - Salam");
            System.out.println("2 - Sağol");
            System.out.println("3 - Çıx");
            secim = input.next().charAt(0);
            if (secim == '1') {
                System.out.println("Salam");
                System.out.println();
            }
            else if (secim == '2') {
                System.out.println("Sağol");
                System.out.println();
            }
        } while (secim != '3');


    }
}
