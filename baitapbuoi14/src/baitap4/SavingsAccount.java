package baitap4;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Số dư không đủ. Tài khoản tiết kiệm yêu cầu đủ số dư để rút tiền.");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Tài khoản tiết kiệm - Số tài khoản: " + accountNumber + ", Số dư: " + balance);
        System.out.println("Số dư khả dụng để rút: " + balance);
    }
}
