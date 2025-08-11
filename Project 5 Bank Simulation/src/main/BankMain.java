package main;

import model.SavingsAccount;
import service.BankService;

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("Jatin Rana", 1000, 5.0);
        BankService service = new BankService(account);
        service.start();
    }
}
