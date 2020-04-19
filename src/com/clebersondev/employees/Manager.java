package com.clebersondev.employees;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double getBenefit() {
        return 0.15;
    }

    @Override
    public String getPosition() {
        return "Gerente";
    }
}
