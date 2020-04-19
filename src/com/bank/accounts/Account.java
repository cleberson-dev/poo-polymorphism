package com.bank.accounts;
import java.lang.Exception;

public class Account {
    protected int number;
    public String name;
    protected double balance;

    public Account(int number, String name, double balance) throws Exception {
        if (balance < 0) throw new Exception("");

        this.number = number;
        this.balance = balance;
        this.name = name;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) throw new Exception("Valor inválido. Somente valores positivos diferentes de 0");
        if (amount > this.balance) throw new Exception("Saldo insuficiente para saque de tal quantia.");

        this.balance -= amount;
    }

    public void deposit(double valor) throws Exception {
        if (valor < 0) throw new Exception("");

        this.balance += valor;
    }

    public String summarize() {
        String summary = String.format("Conta: %s | Nome: %s | Saldo: R$%.2f", this.number, this.name, this.balance);
        return summary;
    }
}
