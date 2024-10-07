package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setGroup("B1");
        student.setAdmission(new Date());
        System.out.println("Student "
                + student.getName()
                + " is enrolled at the University, in group \""
                + student.getGroup()
                + "\". Admission date is: "
                + student.getAdmission());
    }
}
