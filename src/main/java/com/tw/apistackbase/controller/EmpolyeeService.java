package com.tw.apistackbase.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpolyeeService {
    private Map< Long, Employee> employees = new HashMap<Long, Employee>();


    public List<Employee> getAll(){
        // map.values() return a Collection of all values in that map.
        // new ArrayList<T>(collection) can create an array list containing all values in the collection.
        return new ArrayList<Employee>(this.employees.values());
    }

    public Employee create(Employee employees){
        return null;
    }


}
