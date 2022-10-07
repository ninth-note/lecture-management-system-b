package com.assignment1b;

import com.assignment1a.Student;
import org.joda.time.LocalDate;

public class LectureManagementSystem {

    public static void main(String[] args) {

        Student student = new Student("Charles", new LocalDate(1990, 3, 25), 1);

        System.out.println(student);

    }

}
