// 1-50 arası ədədlərin cəmi və ədədi ortası

package Loops_Arrays;

public class SumAndAverage {
    static void main(String[] args) {
        int cem = 0;
        for(int i = 1; i<=50; i++) {
            cem += i;
        }
        double orta = cem/50;
        System.out.println("cəm: " + cem + " ədədi ortası: " + orta);

    }
}
