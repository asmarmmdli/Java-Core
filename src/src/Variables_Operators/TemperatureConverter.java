// Temperaturun Selsiyə çevrilməsi və vəziyyətinin təyini

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Farenheyt ilə temperaturu daxil edin:");
        double f = input.nextDouble();
        double c = ((f-32)*5.0)/9.0;
        if (c<0) {
            System.out.println("Dondurucu.");
        }
        else if (c>0 && c<20) {
            System.out.println("Soyuq.");
        }
        else if (c>=20 && c<=35) {
            System.out.println("İsti.");
        }
        else {
            System.out.println("Çox isti.");
        }
    }
}