// Doğum ilinə görə yaşın hesablanması

package Variables_Operators;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Doğum ilinizi daxil edin:");
int tevellud = input.nextInt();
       int yas = 2025 - tevellud;
        System.out.println(yas);

    }
}
