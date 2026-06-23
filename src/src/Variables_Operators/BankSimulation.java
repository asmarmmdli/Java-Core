// Balans yoxlanışı ilə yatırım və çıxarış əməliyyatları

import java.util.Scanner;

public class BankSimulation {
    public static void main(String[] args) {
        double balans = 1000.00;
        System.out.println("1. Yatırım/Mədaxil");
        System.out.println("2. Çıxarış/Məxaric");
        System.out.println("3. Balans");
        Scanner input = new Scanner(System.in);
        System.out.println("Əməliyyat daxil edin (1-3):");
        char emeliyyat = input.next().charAt(0);

        if (emeliyyat == '1') {
            System.out.println("Mədaxil edəcəyiniz məbləği qeyd edin:");
            double mebleg = input.nextDouble();
            double son = balans + mebleg;
            System.out.println("Son balansınız: " + son);
        }
        else if (emeliyyat == '2') {
            System.out.println("Məxaric edəcəyiniz məbləği qeyd edin:");
            double mebleg = input.nextDouble();
            if  (mebleg<=1000) {
                double son = balans - mebleg;
                System.out.println("Son balansınız: " + son);
            }
             else {
                System.out.println("Kifayət qədər balansınız yoxdur.");
            }
        }
        else if (emeliyyat == '3') {
            System.out.println("Cari balansınız: " + balans);
        }
        else {
            System.out.println("Xəta!");
        }

    }

}
