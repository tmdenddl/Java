package Bank;

import java.util.ArrayList;

public class BankDriver {
    public static void main(String[] args) {
        // Initialize Person
        /*
        // Method 1
        Person p1 = new Person();
        p1.name = "Kevin";
        p1.age = 25;
        p1.cashAmount = 300;

        // Method 2
        Person p1 = new Person();
        p1.setName("김신의");
        p1.setAge(28);
        p1.setCashAmount(30000);
         */

        Person p1 = new Person("김신의", 28, 30000);

        Person p2 = new Person("문종모", 25, 100000);

        // Initialize BankAccount
        BankAccount a1 = new BankAccount(100000, p1);
        p1.setAccount(a1);

        BankAccount a2 = new BankAccount(500000, p2);
        p2.setAccount(a2);


        // Deposit & Withdraw Test
        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));

        // Transfer Test
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);

        System.out.println("-----------------------------------------------------------------------------------------");

        // New Person
        Person p3 = new Person("사회초년생", 22, 100000);

        // Casting
        BankAccount ba = new BankAccount(0, p3);
        MinimumBalanceAccount mba = new MinimumBalanceAccount(p3);
        SavingsAccount sa = new SavingsAccount(p3);

        // List for accounts P3 holds
        ArrayList<BankAccount> accounts = new ArrayList<>();

        // ba, mba, sa is either an instance of BankAccount or its children instance
        accounts.add(ba);
        accounts.add(mba);
        accounts.add(sa);

        // To add 1000 to every accounts P3 holds
        for (BankAccount account : accounts) {
            account.deposit(1000);
        }

        // To add interest to SavingsAccount ONLY
        for (BankAccount account : accounts) {
            account.deposit(1000);

            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            }
        }
    }
}
