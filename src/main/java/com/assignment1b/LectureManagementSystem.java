package com.assignment1b;

import com.assignment1a.Student;
import com.assignment1a.Course;
import com.assignment1a.Module;
import com.assignment1a.Lecturer;
import org.joda.time.LocalDate;
import java.util.ArrayList;

public class LectureManagementSystem {

    public static void main(String[] args) {

        // creating a handful of fictional students
        Student student1 = new Student("Monkey D Luffy", new LocalDate(1990, 3, 25), 1);
        Student student2 = new Student("Roronoa Zoro", new LocalDate(1987, 9, 12), 2);
        Student student3 = new Student("Nami", new LocalDate(1998, 7, 3), 3);
        Student student4 = new Student("Usopp", new LocalDate(1991, 2, 1), 4);
        Student student5 = new Student("Tony Tony Chopper", new LocalDate(1998, 5, 22), 5);
        Student student6 = new Student("Nico Robin", new LocalDate(1992, 3, 19), 6);

        // create modules
        Module CS101 = new Module("CS101", 101);    Module CS102 = new Module("CS102", 102);
        Module MA201 = new Module("MA201", 201);    Module MA202 = new Module("MA202", 202);
        Module EN301 = new Module("EN301", 301);    Module EN302 = new Module("EN302", 302);

        // create lecturers
        Lecturer John = new Lecturer("John Smith", new LocalDate(1980, 4, 11), 1);
        Lecturer Patrick = new Lecturer("Patrick Barnes", new LocalDate(1975, 6, 25), 2);
        Lecturer Mason = new Lecturer("Mason Nell", new LocalDate(1993, 1, 7), 3);
        Lecturer Paul = new Lecturer("Paul Bell", new LocalDate(1979, 5, 21), 4);
        Lecturer Luke = new Lecturer("Luke Frost", new LocalDate(1982, 8, 5), 5);

        // create courses
        Course CS = new Course("CS", new LocalDate(2022, 9, 1), new LocalDate(2023, 6, 16));
        Course MA = new Course("MA", new LocalDate(2022, 9, 1), new LocalDate(2023, 6, 16));
        Course EN = new Course("EN", new LocalDate(2022, 9, 1), new LocalDate(2023, 6, 16));


        /**
         * 1. After every one is created, we can now first assign lecturers responsible for the modules.
         * 2. Following this we can then add these modules to their respective courses.
         * 3. Then finally we add these courses to the students, while the students are respectively added to the courses.
         */

        // assign lecturers to their modules
        CS101.addLecturerResponsible(John);     CS102.addLecturerResponsible(Patrick);
        MA201.addLecturerResponsible(Mason);     MA202.addLecturerResponsible(John);
        EN301.addLecturerResponsible(Luke);     EN302.addLecturerResponsible(Paul);

        // add modules to their respective courses
        CS.addModule(CS101);    CS.addModule(CS102);    CS.addModule(MA201);
        MA.addModule(MA201);    MA.addModule(MA202);    MA.addModule(CS101);
        EN.addModule(EN301);    EN.addModule(EN302);    EN.addModule(CS101);

        // add courses to students
        student1.addCourse(CS);     student5.addCourse(CS);
        student1.addCourse(EN);     student5.addCourse(MA);
        student2.addCourse(EN);     student5.addCourse(EN);
        student3.addCourse(MA);     student6.addCourse(EN);
        student4.addCourse(CS);


        /**
         * 1. Now we will create a list of all courses that in turn will be looped through printing out all the courses,
         * and information about them, such as the modules they have and the usernames of the students that take them.
         */

        ArrayList<Course> courses = new ArrayList<>();

        courses.add(CS);
        courses.add(MA);
        courses.add(EN);

        System.out.println("\nCourses{");

        for (Course course: courses) {
            System.out.println(course);
        }

        System.out.println("\n}");

        /**
         * 2. Now we will create a list of all students that in turn will be looped through printing out all the students,
         * and information about them, such as registered modules, courses, and their usernames.
         */

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println("\nStudents{");

        for (Student student: students) {
            System.out.println(student);
        }

        System.out.println("\n}");

        /**
         * 3. Now we will create a list of all modules that in turn will be looped through printing out all the modules,
         * and information about them, such as associated courses, and lecturer responsible.
         */

        ArrayList<Module> modules = new ArrayList<>();

        modules.add(CS101);
        modules.add(CS102);
        modules.add(MA201);
        modules.add(MA202);
        modules.add(EN301);
        modules.add(EN302);

        System.out.println("\nModules{");

        for (Module module: modules) {
            System.out.println(module);
        }

        System.out.println("\n}");

        /**
         * 4. Now we will create a list of all lecturers that in turn will be looped through printing out all the lecturers,
         * and information about them, such as the modules they are associated with.
         */

        ArrayList<Lecturer> lecturers = new ArrayList<>();

        lecturers.add(John);
        lecturers.add(Patrick);
        lecturers.add(Mason);
        lecturers.add(Paul);
        lecturers.add(Luke);

        System.out.println("\nLecturers{");

        for (Lecturer lecturer: lecturers) {
            System.out.println(lecturer);
        }

        System.out.println("\n}");

    }

}
