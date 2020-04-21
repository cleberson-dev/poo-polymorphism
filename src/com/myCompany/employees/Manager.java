package com.myCompany.employees;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double getBenefit() {
        return 0.1;
    }

    @Override
    public String getPosition() {
        return "Gerente";
    }
}
