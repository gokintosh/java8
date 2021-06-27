package com.gokulnair.stream.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public static List<Employee>getEmployee(){
        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(new Employee(100,"Suresh","Civil",40000));
        employeeList.add(new Employee(101,"Nimesh","Architect",20000));
        employeeList.add(new Employee(102,"Krupesh","Archiological",30000));
        employeeList.add(new Employee(103,"Siddharth","Mechanical",50000));
        employeeList.add(new Employee(104,"Lavkesh","Food Engineering",60000));

        return employeeList;
    }
}
