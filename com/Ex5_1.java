package com;

import com.loan.LoanAccount;

public class Ex5_1 {
    public static void main(String args[]) {
        LoanAccount obj = new LoanAccount();
        obj.doTransaction(Integer.parseInt(args[1]), args[0]);
        System.out.println("Amount balance : " + obj.balance);
    }

}
