package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Heldana", "123", 12500);
        Valuable account2 = new BankAccount("Eyob", "456", 1500);

        account1.deposit(100);

        System.out.println("Heldana's balance: $" + account1.getBalance());
        System.out.println("Eyob's value: $" + account2.getValue());

    }
}
