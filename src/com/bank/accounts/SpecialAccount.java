package com.bank.accounts;
import java.lang.Exception;

public class SpecialAccount extends Account {
    private double lineOfCredit;
    private double limit = 1000;

    public SpecialAccount(int number, String name, double balance) throws Exception {
        super(number, name, balance);

        this.lineOfCredit = this.limit;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount <= 0) throw new Exception("Valor inválido. Somente valores positivos diferentes de 0 são permitidos");
        if (amount > this.balance + this.lineOfCredit) throw new Exception("Saldo e/ou limite insuficiente para transação de tal quantia.");

        if (amount > this.balance) {
            double amountLeftForLOCWithdrawal = amount - this.balance;

            this.balance = 0;
            this.lineOfCredit -= amountLeftForLOCWithdrawal;
            return;
        }

        this.balance -= amount;
    }

    @Override
    public void deposit(double amountToDeposit) throws Exception {
        if (amountToDeposit < 0) throw new Exception("");

        if (this.lineOfCredit >= this.limit) {
            super.deposit(amountToDeposit);
            return;
        }

        double owedAmount = this.limit - this.lineOfCredit;

        if (amountToDeposit <= owedAmount) {
            this.lineOfCredit += amountToDeposit;
            return;
        }

        double leftover = amountToDeposit - owedAmount;
        this.lineOfCredit = this.limit;
        this.balance = leftover;
    }

    @Override
    public String summarize() {
        String summary = String.format("Conta Especial: %s | Nome: %s | Saldo: R$%.2f | Limite: R$%.2f", this.number, this.name, this.balance, this.lineOfCredit);
        return summary;
    }

}
