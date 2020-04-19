package com.myCompany.employees;

public class Engineer extends Employee {
    public Engineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getPosition() {
        return "Engenheiro";
    }
}
