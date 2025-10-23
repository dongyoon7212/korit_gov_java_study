package _16_Class.BankAccount;

public class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
        System.out.println("계좌가 개설되었습니다. 현재 잔액 : " + this.balance + "원");
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("계좌에 " + amount + "원이 입금되었습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println("입금액은 0원 초과이어야 합니다.");
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("출금액은 0원 초과이어야 합니다.");
        } else if(amount > balance) {
            System.out.println("잔액이 부족합니다. 현재 잔액 : " + balance + "원");
        } else {
            balance -= amount;
            System.out.println("출금되었습니다. 현재 잔액 : " + balance);
        }
    }
}
