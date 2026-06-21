// Sadə hesablama

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İki ədəd daxil edin: ");
        double eded1 = input.nextDouble();
        double eded2 = input.nextDouble();
        System.out.println("Əməliyyatı daxil edin (+,-,/,*): ");
        char operator = input.next().charAt(0);
        printResult(eded1,operator,eded2);

    }
    public static void printResult(double eded1, char operator, double eded2) {
        if (operator=='+') {
            System.out.println("Nəticə: " + (eded1+eded2));
        }
        else if (operator=='-') {
            System.out.println("Nəticə: " + (eded1-eded2));
        }
        else if (operator=='*') {
            System.out.println("Nəticə: " + (eded1*eded2));
        }
        else if (operator=='/') {
            if (eded2==0) {
                System.out.println("XƏTA! sıfıra bölmə təyin edilməyib.");
            }
            else {
                System.out.println("Nəticə: " + (eded1/eded2));
            }
        }
        else {
            System.out.println("Operator daxil edərkən xəta.");
        }

    }

}
