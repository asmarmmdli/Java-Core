// Massivdəki ən böyük elementin tapılması

package Loops_Arrays;

import java.util.Scanner;

public class ArrayMaxFinder {
    static void main(String[] args) {
        System.out.println("Massivin elementlərini daxil edin (10 element):");
        int[] massiv = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<massiv.length; i++) {
            massiv[i]= input.nextInt();
        }
        System.out.print("Massiv: ");
        for(int i: massiv) {
            System.out.print(i + " ");
        }
        int max = massiv[0];
        for(int j = 1; j<massiv.length; j++) {
            if (max<massiv[j]) {
                max = massiv[j];
            }
        }
        System.out.println();
        System.out.println("Ən böyük elementi: " + max);



    }
}
