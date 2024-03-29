package com.util.maps;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new HashMap<>();
        map.put(new Department("CSE",101,"Akash"),
                Arrays.asList(new Student("Ajay","Arjun")));
        map.put(new Department("ISE",202,"Chandan"),
                Arrays.asList(new Student("Charan","Chandru")));
        map.put(new Department("ECE",303,"Ram"),
                Arrays.asList(new Student("Ramesh","Ramana")));

        Set<Department> departments = map.keySet();
        for (Department department:departments){
            System.out.println(department.getDeptHead()+" "+department.getDeptName());
            List<Student> students = map.get(department);
            for (Student student:students){
                System.out.println(student.getStudentName());
            }
        }
    }
}
