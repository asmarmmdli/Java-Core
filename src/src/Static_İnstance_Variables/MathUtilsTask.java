// Static metod, obyektsiz çağırış

public class MathUtilsTask {
    public static class MathUtils {

        public static int square(int number) {
            return number * number;
        }

        public static int cube(int number) {
            return number*number*number;
            }
        }

    public static void main(String[] args) {
        int netice1 = MathUtils.square(5);
        int netice2 = MathUtils.cube(3);

        System.out.println("Kvadrat: " + netice1);
        System.out.println("Kub: " + netice2);
    }
    }


