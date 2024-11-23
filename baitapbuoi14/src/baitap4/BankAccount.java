package baitap4;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Đã nạp " + amount + ". Số dư mới: " + balance);
        } else {
            System.out.println("Số tiền nạp phải là số dương.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Đã rút " + amount + ". Số dư mới: " + balance);
        } else {
            System.out.println("Không đủ tiền hoặc số tiền không hợp lệ.");
        }
    }

    public void displayBalance() {
        System.out.println("Số tài khoản: " + accountNumber + ", Số dư: " + balance);
    }
}

