// 1-99 arası tək ədədlərin cəmi

public class OddNumbersSum {
    static void main(String[] args) {
        int cem = 0;
        int i = 1;
        while (i<100) {
            if (i%2!=0){
                cem = cem + i;
                i = i + 2;
            }

        }
        System.out.println("Cəm: " + cem);


    }
}
