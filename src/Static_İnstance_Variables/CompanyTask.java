// Static metod ilə instance metodun birgə istifadəsi

package Static_Instance_Variables;

public class CompanyTask {
    public static class Company {
        String employeeName;
        static String officeName = "Bakı";
        static int employeeCount = 0;

        public Company(String employeeName) {
            this.employeeName = employeeName;
            employeeCount++;
        }

        public void showInfo() {
            System.out.println("İşçi adı: " + employeeName);
            System.out.println("Ofis adı: " + officeName);
            System.out.println();

        }

        public static void officeInfo(){
            System.out.println("Ofis Məlumatı:");
            System.out.println("Ofis adı: " + officeName);
            System.out.println("İşçi sayı: " + employeeCount);
        }


    }
    public static void main(String[] args) {
        Company employee1 = new Company("Əsmər");
        Company employee2 = new Company("Ləman");
        Company employee3 = new Company("Lətifə");
        Company employee4 = new Company("Zəhra");
        Company employee5 = new Company("Günel");

        employee1.showInfo();
        employee2.showInfo();
        employee3.showInfo();
        employee4.showInfo();
        employee5.showInfo();

        Company.officeInfo();
    }
}
