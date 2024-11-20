package baitap3;

public class BankAccount {
    private int account_number;
    private double balance;

    public BankAccount(int account_number, double balance){
        this.account_number = account_number;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void deposit(double amount){
         if( amount > 0 ){
             balance += amount;
             System.out.println("Đã nạp tiền vào tài khoản thành công");
         } else {
             System.out.println("Nạp tiền vào tài khoản thành công ");
         }
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Số dư không đủ để rút tiền");
        } else {
            balance -= amount;
            System.out.println("Đã rút tiền trong tài khoản thành công");
        }
    }

    public String display_balance(){
        return "Số dư hiện tại: " + getBalance();
    }
}
