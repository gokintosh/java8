package com.gokulnair.stream.employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public static List<Employee>getTaxableEmployee(String input){
        return (input.equalsIgnoreCase("tax"))?
             EmployeeDao.getEmployee().stream().filter(emp->emp.getSalary()>30000).collect(Collectors.toList()):
             EmployeeDao.getEmployee().stream().filter(t->t.getSalary()<=30000).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(getTaxableEmployee("tax"));
    }
}
