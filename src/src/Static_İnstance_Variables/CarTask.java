// Static və instance dəyişənin müqayisəsi

public class CarTask {
    public static class Car {
        String licensePlate;
        static int wheelCount = 4;

        public Car(String licensePlate){
            this.licensePlate=licensePlate;
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car("09-BR-763");
        Car car2 = new Car("10-NX-030");
        Car car3 = new Car("90-DD-838");

        System.out.println("Ilk maşının nömrəsi: " + car1.licensePlate);
        System.out.println("İkinci maşının nömrəsi: " + car2.licensePlate);
        System.out.println("Üçüncü maşının nömrəsi: " + car3.licensePlate);

        System.out.println("Hərəsinin ayrıca təkər sayı: " + Car.wheelCount);

    }

}
