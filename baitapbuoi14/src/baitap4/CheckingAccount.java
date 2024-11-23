package baitap4;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit = 500.0;
    private double overdraftFee = 20.0;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= -overdraftLimit) {
                balance -= amount;
                if (balance < 0) {
                    balance -= overdraftFee;
                    System.out.println("Phí thấu chi áp dụng: " + overdraftFee);
                }
                System.out.println("Withdrew " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Vượt quá giới hạn thấu chi.");
            }
        } else {
            System.out.println("Số tiền rút phải là số dương.");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Tài khoản thanh toán - Số tài khoản: " + accountNumber + ", Số dư: " + balance);
    }
}

