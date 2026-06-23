// Normal və əlavə iş saatlarına görə maaşın hesablanması

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Saat başı ödənişi qeyd edin:");
        double odenis = input.nextDouble();
        System.out.println("İşləmə müddətini qeyd edin (saat):");
        int saat = input.nextInt();
        if (saat<=40) {
            double maas = saat * odenis;
            System.out.println("Maaş: " + maas);
        }
        else if (saat>40) {
            double maas = 40 * odenis + (saat-40)*odenis*1.5;
            System.out.println("Maaş: " + maas);
        }
        else {
            System.out.println("Xəta!");
        }
    }
}

