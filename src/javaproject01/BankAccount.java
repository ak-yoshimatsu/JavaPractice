package javaproject01;

public class BankAccount {
    // privateフィールドでカプセル化
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // コンストラクタ
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // 預金メソッド
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "円を預金しました。");
        } else {
            System.out.println("預金額は0より大きい必要があります。");
        }
    }

    // 引き出しメソッド
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "円を引き出しました。");
        } else {
            System.out.println("残高不足または無効な金額です。");
        }
    }

    // 残高照会メソッド
    public void checkBalance() {
        System.out.println("口座番号: " + accountNumber);
        System.out.println("口座名義: " + accountHolder);
        System.out.println("残高: " + balance + "円");
    }

    // ゲッター
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}
