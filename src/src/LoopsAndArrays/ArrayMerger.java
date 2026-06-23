// İki massivin yeni massivdə birləşdirilməsi

public class ArrayMerger {
    public static void main(String[] args) {
        int[] massiv1 = {2,3,4};
        int[] massiv2 = {6,7,9};
        int[] birlesmis = new int[6];
        for(int i = 0; i<massiv1.length; i++) {
            birlesmis[i] = massiv1[i];
        }
        for(int j =0; j<massiv2.length; j++) {
            birlesmis[j + massiv1.length] = massiv2[j];
        }
        System.out.println("Birləşmiş yeni massiv: ");
        for(int i: birlesmis) {
            System.out.print(i + " ");
        }


    }
}
