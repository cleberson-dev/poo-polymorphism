package com.myCompany;

import com.myCompany.employees.Manager;
import com.myCompany.employees.Secretary;
import com.myCompany.employees.Employee;
import com.myCompany.employees.Engineer;
import com.myCompany.employees.Director;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Engineer("Susan", 3100));
        employees.add(new Secretary("Lucas", 2542));
        employees.add(new Director("Velma", 5000));
        employees.add(new Manager("Antônio", 7503));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    
}
