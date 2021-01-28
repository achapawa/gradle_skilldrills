package edu.isu.cs.cs2263;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student extends Course{
    private String firstName;
    private String lastName;
   // private ArrayList<Course> CourseList;

   // public Student(){}


    public Student(String firstName, String lastName,int number, String subject,String title){
        super(number,subject,title);
        this.firstName=firstName;
        this.lastName=lastName;
        //this.CourseList = new ArrayList<Course>();

    }

    public void setFirstName(String name) {
        name = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String name) {
        name = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}'+super.toString();
    }
    //public void addCourse(Course cours){
      //  CourseList.add(cours);
   // }


}