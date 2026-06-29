// Sadə instance dəyişən

package Static_Instance_Variables;

public class BookTask {

    public static class Book{

    String title;
    int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }
    }
    public static void main(String[] args)  {
        Book book1 = new Book("Kürk Mantolu Madonna",224);
        Book book2 = new Book("Şahmat",104);

        System.out.println("Kitab 1:");
        System.out.println("Ad: " + book1.title);
        System.out.println("Səhifə sayı: " + book1.pageCount);

        System.out.println();

        System.out.println("Kitab 2:");
        System.out.println("Ad: " + book2.title);
        System.out.println("Səhifə sayı: " + book2.pageCount);

    }
}

