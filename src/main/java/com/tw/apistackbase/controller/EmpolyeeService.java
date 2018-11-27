package com.tw.apistackbase.controller;

import java.util.ArrayList;
import java.util.List;

public class EmpolyeeService {
    private  List <Employee> employees;

    public EmpolyeeService(List<Employee> employees){
        this.employees = new ArrayList<>();
        this.employees.add(new Employee("testEmployee" ,15, "Female"));
    }


    public List <Employee> getAll(){
        return this.employees;
    }

    public int createEmployee (Employee employee){
        return
    }

}
