package com.bank.accounts;
import java.lang.Exception;

public abstract class Account {
    protected int number;
    public String name;
    protected double balance;

    public Account(int number, String name, double balance) throws Exception {
        if (balance < 0) throw new Exception("");

        this.number = number;
        this.balance = balance;
        this.name = name;
    }

    public abstract void withdraw(double amount) throws Exception;

    public void deposit(double valor) throws Exception {
        if (valor < 0) throw new Exception("");

        this.balance += valor;
    }

    public String summarize() {
        String summary = String.format("Conta: %s | Nome: %s | Saldo: R$%.2f", this.number, this.name, this.balance);
        return summary;
    }
}
