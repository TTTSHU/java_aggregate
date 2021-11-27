package com.company.HashMap练习;

public class Employee {
    private String name;
    private String wages;
    private String name_id;

    public Employee(String name, String wages, String name_id) {
        this.name = name;
        this.wages = wages;
        this.name_id = name_id;
    }

    public Employee(String name_id) {
        this.name_id = name_id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWages() {
        return wages;
    }

    public void setWages(String wages) {
        this.wages = wages;
    }

    public String getName_id() {
        return name_id;
    }

    public void setName_id(String name_id) {
        this.name_id = name_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", wages='" + wages + '\'' +
                ", name_id='" + name_id + '\'' +
                '}';
    }
}
