// Elementin massivdəki indeksinin axtarışı

import java.util.Scanner;

public class ArraySearcher {
    public static void main(String[] args) {
        int[] massiv = {1,2,3,4,5,6,7,8};
        Scanner input = new Scanner(System.in);
        System.out.println("Axtardığınız ədədi daxil edin:");
        int eded = input.nextInt();
        boolean tapildi = false;
        for(int i = 0; i<massiv.length; i++) {
            if (massiv[i] == eded) {
                System.out.println("Bu ədəd var, indexi: " + i);
                tapildi = true;

            }
        }
           if (tapildi==false) {
               System.out.println("Bu ədəd yoxdur.");
           }
        }
        }

