// Salamlama mətni

import java.util.Scanner;
import java.util.SortedMap;

public class GreetingBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ad və soyadınızı ayrıca daxil edin.");
        String ad = input.next();
        String soyad = input.next();
        System.out.println("Salam, " + ad + " " + soyad + "!");

    }
}

