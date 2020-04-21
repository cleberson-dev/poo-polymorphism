package com.myCompany.employees;

public class Director extends Employee {
    public Director(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double getBenefit() {
        return 0.15;
    }

    @Override
    public String getPosition() {
        return "Diretor";
    }
}
