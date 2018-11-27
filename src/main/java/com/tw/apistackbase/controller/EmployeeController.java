package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
public class EmployeeController {

    private EmpolyeeService empolyeeService;

    @Autowired
    public EmployeeController(EmpolyeeService empolyeeService){
        this.empolyeeService = empolyeeService;
    }

    @GetMapping(path = "/getAll", produces = {"application/json"})
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(empolyeeService.getAll());
    }

    @PostMapping(path = "/add", produces = {"application/json"})
    public ResponseEntity<Employee> create(@RequestBody Employee employee){
        return ResponseEntity.ok(empolyeeService.create(employee));
    }

    @PutMapping(path = "/update/{id}", produces = {"application/json"})
    public ResponseEntity<Employee> update(@PathVariable Integer id, @RequestBody Employee employee){
        return ResponseEntity.ok(empolyeeService.update(id,employee));
    }

    @DeleteMapping(path = "/delete/{id}", produces = {"application/json"})
    public ResponseEntity<Employee> delete(@PathVariable Integer id){
        return ResponseEntity.ok(empolyeeService.delete(id));
    }


}













