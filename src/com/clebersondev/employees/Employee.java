package com.clebersondev.employees;

public class Employee {
    public String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalaryWithBenefit() {
        return this.salary * (1 + this.getBenefit());
    }

    protected double getBenefit() {
        return 0.05;
    }

    public String getPosition() {
        return "Funcionário";
    }

    public String toString() {
        String info = this.name + "(" + this.getPosition() + ") => ";
        info += "Salário: R$%.2f + Benefícios(%.2f%%): R$%.2f = R$%.2f";

        return String.format(info, this.salary, this.getBenefit() * 100, this.salary * this.getBenefit(), this.getSalaryWithBenefit());
    }
}
