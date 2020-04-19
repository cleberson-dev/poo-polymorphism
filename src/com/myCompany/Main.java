package com.myCompany;

import com.myCompany.employees.Manager;
import com.myCompany.employees.Secretary;
import com.myCompany.employees.Employee;
import com.myCompany.employees.Engineer;
import com.myCompany.employees.Director;
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
