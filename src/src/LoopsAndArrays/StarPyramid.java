// İç-içə dövrlərlə ulduz piramidasının qurulması

import java.util.Scanner;

public class StarPyramid {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-10 arası ədəd daxil edin: ");
        int eded = input.nextInt();
        if (eded>=1 && eded<=10) {
            for (int i = 1; i <= eded; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
        else {
            System.out.println("Ədəd daxil edərkən xəta!");
        }
    }
}
