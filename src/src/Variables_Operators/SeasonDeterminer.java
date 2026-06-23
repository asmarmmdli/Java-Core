// Ay nömrəsinə görə fəslin təyini

import java.util.Scanner;

public class SeasonDeterminer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ayın nömrəsini qeyd edin (1-12):");
        int ay = input.nextInt();

        if (ay == 1 || ay == 2 || ay==12) {
            System.out.println("Qış fəslidir.");
        }
        else if (ay == 3 || ay == 4 || ay == 5) {
            System.out.println("Yaz fəslidir.");
        }
        else if (ay == 6 || ay == 7 || ay == 8) {
            System.out.println("Yay fəslidir.");
        }
        else if (ay == 9 || ay == 10 || ay == 11) {
            System.out.println("Payız fəslidir.");
        }
        else {
            System.out.println("Fəsil nömrəsi daxil edərkən xəta!");
        }
    }
}
