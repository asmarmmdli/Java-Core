// Massivin sondan əvvələ doğru çapı

public class ReverseArrayPrinter {
    public static void main(String[] args) {
        int[] massiv = {6,7,8,9,10};
        System.out.println("Massivin tərsi: ");
        for(int i = massiv.length-1; i>=0; i--) {
            System.out.print(massiv[i] + " ");

        }

    }
}
