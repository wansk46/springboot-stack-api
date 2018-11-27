package com.tw.apistackbase.controller;

public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }




}
