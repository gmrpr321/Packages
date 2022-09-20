package com.loan;

import com.transact.Transaction;

public class LoanAccount extends Transaction {
    public int balance = 0;

    public void doTransaction(int amount, String choice) {
        String temp = "credit";
        if (choice.equals(temp))
            balance = credit(amount, balance);
        temp = "debit";
        if (choice.equals(temp))
            balance = debit(amount, balance);
    }
}