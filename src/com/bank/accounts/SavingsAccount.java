package com.bank.accounts;
import java.lang.Exception;

public class SavingsAccount extends Account {
    private double savingsBalance;

    public SavingsAccount(int number, String name, double savingsBalance) throws Exception {
        super(number, name, 0);
        if (savingsBalance < 0) throw new Exception("");

        this.savingsBalance = savingsBalance;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount < 0) throw new Exception("");
        if (amount > this.savingsBalance) throw new Exception("");

        this.savingsBalance -= amount;
    }

    public void withdraw(String to, double amount) throws Exception {
        if (to.equals("poupança")) {
            this.withdraw(amount);
            return;
        }

        if (to.equals("corrente")) {
            super.withdraw(amount);
            return;
        }

        throw new Exception("Opção de saque inválida (Escolha entre 'corrente' ou 'poupança')");
    }

    @Override
    public void deposit(double amount) throws Exception {
        if (amount < 0) throw new Exception("");

        this.savingsBalance += amount;
    }

    public void deposit(String to, double amount) throws Exception {
        if (to.equals("poupança")) {
            this.deposit(amount);
            return;
        }

        if (to.equals("corrente")) {
            super.deposit(amount);
            return;
        }

        throw new Exception("Opção de depósito inválida (Escolha entre 'corrente' ou 'poupança')");
    }

    @Override
    public String summarize() {
        String summary = String.format("Conta Poupança: %s | Nome: %s | Saldo Corrente: R$%.2f | Saldo Poupança: R$%.2f", this.number, this.name, this.balance, this.savingsBalance);
        return summary;
    }
}
