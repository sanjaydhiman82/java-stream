package com.javastream.example;

import lombok.*;
import lombok.Data;

@Getter
@Setter
public class Subject {
    private String title;
    public Subject(String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
