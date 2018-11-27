package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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








}
