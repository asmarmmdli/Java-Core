// Boolean dəyərlər üzərində məntiqi əməliyyatlar

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İki dənə boolean dəyər daxil edin (True/False):");
        boolean logic1 = input.nextBoolean();
        boolean logic2 = input.nextBoolean();

        System.out.println(logic1 && logic2);
        System.out.println(logic1 || logic2);
        System.out.println(!logic1);
        System.out.println(!logic2);
        System.out.println(!logic1 || logic2);


    }


}
