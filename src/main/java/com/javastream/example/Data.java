package com.javastream.example;

import java.util.ArrayList;
import java.util.List;

public class Data {
    static List<Student> getStudents(){
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(8,"Rihansh",List.of(new Subject("Math"))));
        studentList.add(new Student(7,"Aarjab",List.of(new Subject("English"))));
        studentList.add(new Student(9,"Soaurab",List.of(new Subject("Hindi"))));
        studentList.add(new Student(14,"Rohit",List.of(new Subject("Hindi"),new Subject("Math"))));
        studentList.add(new Student(11,"Rajni",List.of(new Subject("Hindi"),new Subject("Math"))));
        studentList.add(new Student(10,"Ajay",List.of(new Subject("English"),new Subject("Math"))));
        studentList.add(new Student(22,"Vijay",List.of(new Subject("Hindi"),new Subject("Russian"))));
        studentList.add(new Student(24,"Rohit",List.of(new Subject("Hindi"),new Subject("Math"))));
        studentList.add(new Student(18,"Aman",List.of(new Subject("Science"))));
        studentList.add(new Student(13,"Rohan",List.of(new Subject("Math"))));
        studentList.add(new Student(6,"Rajeev",List.of(new Subject("soc Study"))));
        studentList.add(new Student(10,"Ganesh",List.of(new Subject("Math"))));
        studentList.add(new Student(11,"Arjit",List.of(new Subject("English"))));
        return studentList;
    }
}
