// this açar sözü ilə giriş

package Static_Instance_Variables;

public class EmployeeTask {
    public static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        public void showSalary() {
            System.out.println("İşçinin adı: " + name);
            System.out.println("İşçinin maaşı: " + salary);
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Employee emp1 = new Employee("Ləman", 2500);
        Employee emp2 = new Employee("Ayan", 2000);
        Employee emp3 = new Employee("Zəhra", 1000);

        emp1.showSalary();
        emp2.showSalary();
        emp3.showSalary();
    }
}
