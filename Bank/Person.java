package Bank;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    // Constructor
    public Person(String name, int age) {
        this(name, age, 0);
    }

    public Person(String name, int age, int cashAmount) {
        this.name = name;

        if (age < 0) {
            this.age = 12;
        } else {
            this.age = age;
        }

        if (cashAmount < 0) {
            this.cashAmount = 0;
        } else {
            this.cashAmount = cashAmount;
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    // Parameter: to (Person), amount (int)
    // return: if successful (boolean)
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    // Parameter: to (BankAccount), amount (int)
    // return: if successful (boolean)
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }

    /*
    Sort in descending age
    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
     */

    /*
    Sort in ascending age
    @Override
    public int compareTo(Person o) {
        return o.age - age;
    }
     */

    // Sort in name
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
   }
}
