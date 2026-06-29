// Məhsulun qiymətinə görə endirimin tətbiq edilməsi

package Variables_Operators;

import java.util.Scanner;

public class DiscountSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Məhsulun qiymətini daxil edin:");
        int qiymet = input.nextInt();
        if (qiymet>=1000) {
            int son = (qiymet * 75) / 100;
            System.out.println("Endirimli qiymət: " + son);
        }
        else if (qiymet>=500 && qiymet<1000) {
            int son = (qiymet * 85 ) / 100;
            System.out.println("Endirimli qiymət: " + son);
        }
        else if (qiymet>=200 && qiymet<500) {
            int son = (qiymet * 90) / 100;
            System.out.println("Endirimli qiymət: " + son);
        }
        else if (qiymet<200 && qiymet>0) {
            System.out.println("Endirim yoxdur: " + qiymet);
        }
        else if (qiymet<=0) {
            System.out.println("Xəta!");
        }
    }
}
