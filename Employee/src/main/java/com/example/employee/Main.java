package com.example.employee;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Basant");
        Employee employee2 = new Employee(101, "Santosh");

        //print has codes and equality results
        System.out.println("is hashcode() same: " + (employee1.hashCode == employee2.hashCode()));
        System.out.println("is equals() same: " + employee1.equals(employee2));

        //create a hashset to demonstrate duplicate handling
        Set<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        System.out.println(employees);

    }
}
