package com.bank.accounts;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentAccount extends Account {
    private final static String[] COURSES = {"Engenharia da Computação", "Direito", "Medicina", "Administração"};
    private String course;

    public StudentAccount(int number, String name, double balance, String course) throws Exception {
        super(number, name, balance);

        if (!hasCourse(course)) throw new Exception("Curso não encontrado");

        this.course = course;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount <= 0) throw new Exception("Valor inválido. Somente valores positivos diferentes de 0");
        if (amount > this.balance) throw new Exception("Saldo insuficiente para saque de tal quantia.");

        this.balance -= amount;
    }

    @Override
    public void deposit(double amount) throws Exception {
        super.deposit(amount * 1.05);
    }

    @Override
    public String summarize() {
        String summary = String.format("Conta Universitária: %s | Nome: %s | Curso: %s | Saldo: R$%.2f", this.number, this.name, this.course, this.balance);
        return summary;
    }


    public static boolean hasCourse(String course) {
        ArrayList<String> coursesList = new ArrayList<>(Arrays.asList(COURSES));
        return coursesList.contains(course);
    }
}
