package edu.isu.cs.cs2263;


import java.io.Serializable;
import java.util.ArrayList;

public class Course {
    private int number;
    private String subject;
    private String title;



   //public Course(){}

    public Course(int number, String subject, String title ) {
        this.number=number;
        this.subject=subject;
        this.title=title;
    }

    public void setNumber(int num) {
        num = number;
    }

    public int getNumber() {
        return number;
    }

    public void setSubject(String subj) {
        subj = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setTitle(String titl) {
        titl = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Course{" +
                "number=" + number +
                ", subject='" + subject + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

}

