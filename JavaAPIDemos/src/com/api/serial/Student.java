package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;

    private static final long serialVersionUID=3L;
    private int Id;
    private transient String department;


    public Student() {
    }

    public Student(String name, int id, String department) {
        this.name = name;
        Id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", department='" + department + '\'' +
                '}';
    }
}
