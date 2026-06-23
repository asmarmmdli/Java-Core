// İki ədəd üzərində əsas riyazi əməliyyatların icrası

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk ədədi daxil edin:");
        int a = input.nextInt();
        System.out.println("ikinci ədədi daxil edin:");
        int b = input.nextInt();

        System.out.println("Cəm: " + (a+b));
        System.out.println("Fərq: " + (a-b));
        System.out.println("Böləndə tam hissə: " + (a/b));
        System.out.println("Böləndə qalan qalıq (kəsr hissə): " + (a%b));
    }
}
