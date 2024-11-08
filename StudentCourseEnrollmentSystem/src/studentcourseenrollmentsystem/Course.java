/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentcourseenrollmentsystem;

import java.util.ArrayList;

/**
 *
 * @author My University
 */
public class Course {
    
    
    private int courseID;
    private String title;
    private ArrayList<Student> enrolledStudents;

    public Course(int courseID, String title) {
        this.courseID = courseID;
        this.title = title;
        this.enrolledStudents = new ArrayList<Student>();
    }

    public int getCourseID() {
        return courseID;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }
}


