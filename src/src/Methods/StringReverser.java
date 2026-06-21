// Söz tərsinə çevirmə

import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sözü daxil edin:");
        String s = input.next();
        String ters = reverseString(s);
        System.out.println("Daxil etdiyiniz sözün tərsi: " + ters);

    }
    public static String reverseString(String s) {
        String netice = "";
        for(int i = s.length()-1; i>=0 ; i--) {
            netice = netice + s.charAt(i);
        }
        return netice;

    }
}
