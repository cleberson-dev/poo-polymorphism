package com.myCompany.employees;

public class Secretary extends Employee {
    public Secretary(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getPosition() {
        return "Secretário";
    }
}
