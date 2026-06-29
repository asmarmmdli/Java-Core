// Massiv ortası

package Methods;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Elementlərin sayını daxil edin:");
        int n = input.nextInt();
        double[] massiv = new double[n];
        for(int i=0; i<n; i++) {
            massiv[i] = input.nextDouble();
        }
        System.out.println("Ədədi ortasi: " + average(massiv));
    }
    public static double average(double[] arr) {
        double s=0;
        for(int i=0; i<arr.length; i++) {
            s = s+arr[i];
        }
        return s/(arr.length);

    }
}