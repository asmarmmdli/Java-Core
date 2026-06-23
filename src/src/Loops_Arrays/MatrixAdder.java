// İki matrisin uyğun elementlərinin toplanması

import java.util.Scanner;

public class MatrixAdder {
    static void main(String[] args) {
        int[][] mas1 = new int[3][3];
        int[][] mas2 = new int[3][3];
        int[][] cem = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("İlk massivin elementlərini daxil edin (9 element):");
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1.length; j++) {
                mas1[i][j] = input.nextInt();
            }
        }
        System.out.println("İkinci massivin elementlərrini daxil edin (9 element):");
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                mas2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < cem.length; i++) {
            for (int j = 0; j < cem.length; j++) {
                cem[i][j] = mas1[i][j] + mas2[i][j];
            }
        }
        System.out.println("Yeni Massiv: ");
        for (int i = 0; i < cem.length; i++) {
            for (int j = 0; j < cem.length; j++) {
                System.out.print(cem[i][j] + " ");
            }

        }
    }
    }