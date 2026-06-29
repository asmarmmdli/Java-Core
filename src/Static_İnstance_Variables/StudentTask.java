// Obyekt vasitəsilə giriş

package Static_Instance_Variables;

public class StudentTask {
    public static class Student{
        String name;
        String groupNumber;

        public void printInfo() {
            System.out.println("Tələbənin adı: " + name);
            System.out.println("Qrup nömrəsi: " + groupNumber);
        }
    }
    public static void main(String[] args) {
      Student student1 = new Student();
      student1.name = "Əsmər";
      student1.groupNumber = "6525e";

      student1.printInfo();
    }

}
