// Operatora uyğun riyazi hesablama və sıfıra bölmə yoxlanışı

package Variables_Operators;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İki ədəd daxil edin:");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Operator daxil edin (+,-,*,/):");

        char op = input.next().charAt(0);

        if (op == '+') {
            System.out.println("Cəm: " + (a+b));
        }
        else if (op == '-') {
            System.out.println("Fərq: " + (a-b));
        }
        else if (op == '*') {
            System.out.println("Hasil: " + (a*b));
        }
        else if (op == '/') {
            if (b!=0) {
                System.out.println("Nisbət: " + (a / b));
            }
            else {
                System.out.println("Sıfıra bölmə təyin edilməyib.");
            }
        }
        else {
            System.out.println("Operator daxil edərkən xəta!");
        }

    }
}
