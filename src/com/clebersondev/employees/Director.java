package com.clebersondev.employees;

public class Director extends Employee {
    public Director(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double getBenefit() {
        return 0.1;
    }

    @Override
    public String getPosition() {
        return "Diretor";
    }
}
