// Bədən kütlə indeksinin hesablanması və təsnifatı

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu daxil edin (metr):");
        double boy = input.nextDouble();
        System.out.println("Kütlənizi daxil edin (kq):");
        double ceki = input.nextDouble();
        double bmi = ceki / (boy*boy);

        if (bmi<=18.5) {
            System.out.println("Arıq.");
        }
        else if (bmi<25 && bmi>18.5) {
            System.out.println("Normal.");
        }
        else if (bmi>=25 && bmi<30) {
            System.out.println("Kök.");
        }
        else if (bmi>=30 && bmi<35)  {
            System.out.println("1-ci dərəcəli obez.");
        }
        else if (bmi>=35 && bmi<40) {
            System.out.println("2-ci dərəcəli obez.");
        }
        else if (bmi>=40) {
            System.out.println("Morbid obez.");
        }
        else {
            System.out.println("Xəta!");
        }
    }
}
