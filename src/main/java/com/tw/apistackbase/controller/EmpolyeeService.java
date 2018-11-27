package com.tw.apistackbase.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpolyeeService {
    private Map< Integer, Employee> employees = new HashMap<Integer, Employee>();
    private Long idIndex;

    public List<Employee> getAll(){
        // map.values() return a Collection of all values in that map.
        // new ArrayList<T>(collection) can create an array list containing all values in the collection.
        return new ArrayList<Employee>(this.employees.values());
    }

    public Employee create(Employee employee){
        Integer idIndex = employees.size();
        employee.setId(Math.toIntExact(idIndex));
        employees.put(idIndex,employee);
        return employee;
    }

    public Employee update (Integer id, Employee employee){
        employee.setId(id);
        employees.put(id, employee);
        return employee;
    }

    public Employee delete (Integer id){
        return employees.remove(id);
    }


}
