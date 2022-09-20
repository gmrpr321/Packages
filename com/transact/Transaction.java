package com.transact;

public class Transaction {
    protected static int credit(int amount, int balance) {
        if (amount > 50000) {
            System.out.println("Credit Amount per transaction can't exceed 50,000");
            return balance;
        }
        return (balance + amount);
    }

    protected static int debit(int amount, int balance) {
        if (amount > 15000) {
            System.out.println("Debit Amount per transaction can't exceed 15,000");
            return balance;
        }
        if (balance - amount < 0) {
            System.out.println("Requested Debit amount exceeds Balance ");
            return balance;
        }
        return (balance - amount);
    }

}
