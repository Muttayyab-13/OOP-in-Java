/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentcourseenrollmentsystem;

/**
 *
 * @author My University
 */
public class StudentCourseEnrollmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        // Create students
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        // Create courses
        Course course1 = new Course(101, "Mathematics");
        Course course2 = new Course(102, "History");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Print enrolled students for each course
        System.out.println("Enrolled students in " + course1.getTitle() + ":");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Enrolled students in " + course2.getTitle() + ":");
        for (Student student : course2.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        // Print courses enrolled by a student
        System.out.println(student1.getName() + " is enrolled in the following courses:");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getTitle());
        }
    }
}

        
        
    
    

