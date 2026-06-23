// Massiv elementlərinin nümayişi

public class ArrayInitializer {
    static void main(String[] args) {
        int[] massiv = new int[5];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        massiv[3] = 4;
        massiv[4] = 5;
        System.out.println("Massivin elementləri:");
        for(int i = 0;i<massiv.length;i++) {
            System.out.print(massiv[i] + " ");
        }
    }
}
