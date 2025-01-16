package com.javastream.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Student {
    private int age;
    private String name;
    private List<Subject> subjects;
    public Student(int age,String name,List<Subject> subjects){
        this.age=age;
        this.name=name;
        this.subjects=subjects;
    }
    public String toString(){
        return getAge()+"-"+getName()+"-"+getSubjects().get(0).getTitle();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
