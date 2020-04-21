package com.bank.accounts;
import java.lang.Exception;

public class SavingsAccount extends Account {
    private double savingsBalance;

    public SavingsAccount(int number, String name, double savingsBalance) throws Exception {
        super(number, name, 0);
        if (savingsBalance < 0) throw new Exception("Impossível criar conta (Saldo inicial deve ser maior que 0)");

        this.savingsBalance = savingsBalance;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        this.withdrawFromSavings(amount);
    }

    public void withdraw(String to, double amount) throws Exception {
        if (to.equals("poupança")) {
            this.withdrawFromSavings(amount);
            return;
        }

        if (to.equals("corrente")) {
            this.withdrawFromBalance(amount);
            return;
        }

        throw new Exception("Opção de saque inválida (Escolha entre 'corrente' ou 'poupança')");
    }

    private void withdrawFromBalance(double amount) throws Exception {
        if (amount <= 0) throw new Exception("Valor inválido. Somente valores positivos diferentes de 0.");
        if (amount > this.balance) throw new Exception("Saldo insuficiente para saque de tal quantia.");

        this.balance -= amount;
    }

    private void withdrawFromSavings(double amount) throws Exception {
        if (amount < 0) throw new Exception("Valor inválido. Somente valores positivos diferentes de 0 são válidos.");
        if (amount > this.savingsBalance) throw new Exception("Quantia insuficiente na conta poupança para saque.");

        this.savingsBalance -= amount;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if (amount < 0) throw new Exception("Valor inválido. Somente valores positivos diferentes de 0 são válidos.");

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
