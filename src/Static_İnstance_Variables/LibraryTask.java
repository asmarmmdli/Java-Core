// Static - İnstance

package Static_Instance_Variables;

public class LibraryTask {
    public static class Book {
        String title;
        String author;
        static int bookCount = 0;
        static String LIBRARY_NAME = "Mərkəzi Kitabxana";

        public Book(String title,String author) {
            this.title=title;
            this.author=author;
            bookCount++;
        }

        public void showInfo(){
            System.out.println("Kitabın adı: " + title); //
            System.out.println("Müəllifin adı: " + author); //
            System.out.println("Kitabxananın adı: " + LIBRARY_NAME);
            System.out.println();
        }
        public static void libraryReport(){
            System.out.println("Kitabxananın adı: " + LIBRARY_NAME);
            System.out.println("Kitab sayı: " + bookCount);
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book("Kürk Mantolu Madonna", "Sabahattin Ali");
        Book book2 = new Book("Şahmat", "Stefan Zweig");
        Book book3 = new Book("Bilinmeyen bir kadının mektubu", "Stefan Zweig");
        Book book4 = new Book("Olağanüstü bir gece", "Stefan Zweig");

        book1.showInfo();
        book2.showInfo();
        book3.showInfo();
        book4.showInfo();

        Book.libraryReport();
    }
}
