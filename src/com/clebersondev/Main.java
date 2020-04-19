package com.clebersondev;

import com.clebersondev.employees.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> funcionarios = new ArrayList<>();
        funcionarios.add(new Employee("Cleberson", 1000));
        funcionarios.add(new Engineer("Susan", 3100));
        funcionarios.add(new Secretary("Lucas", 2542));
        funcionarios.add(new Director("Velma", 5000));
        funcionarios.add(new Manager("Antônio", 7503));

        for (Employee funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
    
}
