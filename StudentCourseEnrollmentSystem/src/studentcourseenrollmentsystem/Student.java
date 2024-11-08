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
public class Student {
    
    
    private int studentID;
    private String name;
    private ArrayList<Course> courses;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.courses = new ArrayList<Course>();
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }
}

