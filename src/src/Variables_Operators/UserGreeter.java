// İstifadəçinin adı ilə qarşılanması

import java.util.Scanner;

public class UserGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adınızı daxil edin:");
        String ad = input.nextLine();
        System.out.println("Salam! " + ad + "Xoş gəlmisən."); //niye + ile oldu ,le yox
    }

}
