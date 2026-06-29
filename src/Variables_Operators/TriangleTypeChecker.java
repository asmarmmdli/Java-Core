// Üçbucaq bərabərsizliyinin və növünün yoxlanması

package Variables_Operators;

import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üç dənə tərəf daxil edin:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a+b>c && a+c>b && c+b>a){
            if (a==b && b==c) {
                System.out.println("Bərabərtərəfli.");
            }
            else if (a==b || b==c || c==a ) {
                System.out.println("Bərabəryanlı.");
            }
            else{
                System.out.println("Müxtəlifyanlı.");
            }
        }
        else{
            System.out.println("Belə üçbucaq mümkün ola bilməz.");
        }
    }
}
