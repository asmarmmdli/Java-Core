// Radius daxil edilməklə dairənin sahəsinin tapılması

import java.util.Scanner;  //scanneri istifade etmek ucun

public class CircleAreaCalculator {
    public static void main(String[] args) {

        double pi = 3.14159;

        Scanner input = new Scanner(System.in);
        System.out.println("Radiusu daxil edin:");
        int radius = input.nextInt();
        int radiuskvadrati = radius * radius; // ya da math.pow(radius,2)
        double area = pi*radiuskvadrati;
        System.out.println(area);


    }

}
