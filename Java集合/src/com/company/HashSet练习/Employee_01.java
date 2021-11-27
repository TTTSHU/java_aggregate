package com.company.HashSet练习;

import java.util.Objects;

public class Employee_01 {
    private String name;
    private String sal;
    private MyDate birthday;
    public Employee_01(String name, String sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return  "name='" + name + ", sal='" + sal+"."+birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_01 that = (Employee_01) o;
        return Objects.equals(name, that.name) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
