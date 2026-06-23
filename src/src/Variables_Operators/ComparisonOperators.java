// İki ədədin müqayisə operatorları ilə yoxlanması

import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk ədədi daxil edin:");
        int a = input.nextInt();
        System.out.println("İkinci ədədi daxil edin:");
        int b = input.nextInt();


        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);


    }
}
