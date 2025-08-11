package service;

import model.SavingsAccount;
import java.util.Scanner;

public class BankService {
    private SavingsAccount account;
    private Scanner sc = new Scanner(System.in);

    public BankService(SavingsAccount account) {
        this.account = account;
    }

    public void start() {
        int choice;
        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Show Transactions");
            System.out.println("5. Add Interest");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> System.out.println("💵 Current Balance: ₹" + account.getBalance());
                case 4 -> account.showTransactions();
                case 5 -> account.addInterest();
                case 6 -> System.out.println("🚪 Exiting...");
                default -> System.out.println("❌ Invalid choice!");
            }
        } while (choice != 6);
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}
