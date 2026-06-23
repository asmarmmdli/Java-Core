// Massivin statistik göstəricilərinin hesablanması

import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        double cem = 0 ;
        System.out.println("Massivin elementlərini daxil edin (6 element):");
        double[] mas = new double[6];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i< mas.length; i++ ){
            mas[i] = input.nextDouble();
        }
        System.out.print("Massiv: ");
        for(double j: mas) {
            System.out.print(j + " ");
        }
        System.out.println();
        for(int i = 0; i<mas.length; i++) {
            cem = cem + mas[i];
        }
        double orta = cem/6;

        System.out.println("cəm: " + cem + " ədədi ortası: " + orta);
        double min = mas[0];
        double max = mas[0];
        for(int i = 1; i<mas.length; i++) {
            if (mas[i]<min) {
                min = mas[i];
            }

        }
        for(int i = 1; i<mas.length; i++) {
            if (mas[i]>max) {
                max=mas[i];
            }
        }
        System.out.println("Massivdeki ən böyük ədəd: " + max);
        System.out.println("Massivdeki ən kiçik ədəd: " + min);






    }
}


