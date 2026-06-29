//Static sayğac

package Static_Instance_Variables;

public class AccountTask {
    public static class Account {
        static int accountCount;

    public Account() {
        accountCount++;
    }
    }

    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();
        Account acc4 = new Account();

        System.out.println("Yaradılan ümumi hesab sayı: " + Account.accountCount);
    }
}
