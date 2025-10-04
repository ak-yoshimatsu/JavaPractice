package javaproject01;

public class Main {

    public static void main(String[] args) {
        // 口座の作成
        BankAccount account = new BankAccount("1234567890", "山田太郎", 10000);

        // 残高照会
        System.out.println("=== 初期残高 ===");
        account.checkBalance();

        // 預金
        System.out.println("\n=== 預金処理 ===");
        account.deposit(5000);
        account.checkBalance();

        // 引き出し
        System.out.println("\n=== 引き出し処理 ===");
        account.withdraw(3000);
        account.checkBalance();

        // 無効な引き出し
        System.out.println("\n=== 無効な引き出し ===");
        account.withdraw(20000);
        account.checkBalance();
    }

}
