abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public double getBalance() { return balance; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String no, String name, double bal) { super(no, name, bal); }
    public double calculateInterest() { return getBalance() * 0.04; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String no, String name, double bal) { super(no, name, bal); }
    public double calculateInterest() { return getBalance() * 0.02; }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("A1", "Alice", 10000);
        System.out.println("Interest: " + acc1.calculateInterest());
    }
}
