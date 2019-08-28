package Bank;

public class BankAccount {
    protected int balance;
    private Person owner;

    // Constructor
    public BankAccount(int balance) { this(balance, null); }

    public BankAccount(Person owner) {
        this(0, owner);
    }

    public BankAccount(int balance, Person owner) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }

        this.owner = owner;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    // Deposit foreign currency
    public boolean deposit(double amount, double EXCHANGERATE) {
        return deposit((int) (amount * EXCHANGERATE));
    }


    // parameter: amount (int)
    // return: if successful (boolean)
    public boolean deposit (int amount) {
        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            owner.setCashAmount(owner.getCashAmount() - amount);
            balance += amount;
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }

    // parameter: amount (int)
    // return: if successful (boolean)
    public boolean withdraw (int amount) {
        if (amount < 0 || balance < amount) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }

    // Parameter: to (Person), amount (int)
    // return: if successful (boolean)
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    // Parameter: to (BankAccount), amount (int)
    // return: if successful (boolean)
    public boolean transfer(BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.setBalance(to.getBalance() + amount);
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.getOwner().getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return success;
    }
}
