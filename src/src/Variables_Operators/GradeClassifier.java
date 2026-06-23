// Bala əsasən hərfi qiymətin təyin edilməsi

import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Balınızı daxil edin (0-100):");
        int bal = input.nextInt();

        if (bal<=100 && bal>=90) {
            System.out.println("Qiymətiniz: A (əla)");
        }
        else if (bal<=89 && bal>=80) {
            System.out.println("Qiymətiniz: B (yaxşı)");
        }
        else if (bal<=79 && bal>=70) {
            System.out.println("Qiymətiniz: C (kafi)");
        }
        else if (bal<=69 && bal>=60) {
            System.out.println("Qiymətiniz: D (zəif)");
        }
        else if (bal<=59 && bal==0) {
            System.out.println("Qiymətiniz: F (qeyri-kafi)");
        }
        else {
            System.out.println("Yazılan balda xəta!");
        }





    }
}
