// Saniyələrin saat, dəqiqə və saniyəyə çevrilməsi

package Variables_Operators;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Saniyəni daxil edin:");
        int saniye = input.nextInt();
        int saat = saniye / 3600;
        int deqiqe = saniye / 60;

        System.out.println(saat + " saat " + deqiqe + " dəqiqə " + saniye + " saniyə.");
    }

}
