// Fibonacci ardıcıllığının ilk 15 həddi

package Loops_Arrays;

public class FibonacciSequence {
    public static void main(String[] args) {
        int fibo1 = 0; // ilk hədd
        int fibo2 = 1; // ikinci hədd
        for(int i = 1; i<=15; i++) {
            System.out.println(fibo1);
            int yeni = fibo1 +fibo2;
            fibo1 = fibo2;
            fibo2 = yeni;
        }

    }
}
