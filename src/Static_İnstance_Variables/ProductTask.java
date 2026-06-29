// Default dəyərləri yoxlamaq

package Static_Instance_Variables;

public class ProductTask {
    public static class Product {
        String name;
        double price;
        boolean inStock;
        int quantity;
    }
    public static void main(String[] args){
        Product product1 = new Product();

        System.out.println("Məhsulun adı: " + product1.name);
        System.out.println("Qiyməti: " + product1.price);
        System.out.println("Anbarda var?: " + product1.inStock);
        System.out.println("Sayı: " + product1.quantity);
    }
}
