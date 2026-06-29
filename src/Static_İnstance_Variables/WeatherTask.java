// Local dəyişən vs instance dəyişən

package Static_Instance_Variables;

public class WeatherTask {
    public static class Weather {

        String city;

        public void calculateTemperature() {
            int temperature = 28;
            System.out.println("Şəhər: " + city);
            System.out.println("Temperatur: " + temperature);
        }
    }

   public static void main(String[] args) {
        Weather hava = new Weather();
        hava.city = "Bakı";

        hava.calculateTemperature();
    }
}
