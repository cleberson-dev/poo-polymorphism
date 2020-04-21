package com.bank;

import com.bank.accounts.SavingsAccount;
import com.bank.accounts.SpecialAccount;
import com.bank.accounts.StudentAccount;

public class Main {
    public static void main(String[] args) throws Exception {
        SavingsAccount mySavingsAccount = new SavingsAccount(12345, "Cleberson Jr.", 500);
        System.out.println(mySavingsAccount.summarize());
        mySavingsAccount.deposit(200);
        mySavingsAccount.deposit("corrente", 200);
        System.out.println(mySavingsAccount.summarize());
        mySavingsAccount.withdraw(150);
        mySavingsAccount.withdraw("corrente",100);
        System.out.println(mySavingsAccount.summarize());

        System.out.println("--------");

        StudentAccount myStudentAccount = new StudentAccount(12345, "Cleberson Jr.", 100, "Engenharia da Computação");
        myStudentAccount.deposit(100);
        System.out.println(myStudentAccount.summarize());

        System.out.println("--------");

        SpecialAccount mySpecialAccount = new SpecialAccount(12345, "Cleberson Jr.", 600);
        System.out.println(mySpecialAccount.summarize());
        mySpecialAccount.withdraw(750);
        mySpecialAccount.withdraw(800);
        System.out.println(mySpecialAccount.summarize());
        mySpecialAccount.deposit(900);
        System.out.println(mySpecialAccount.summarize());
        mySpecialAccount.deposit(200);
        System.out.println(mySpecialAccount.summarize());
    }
}
