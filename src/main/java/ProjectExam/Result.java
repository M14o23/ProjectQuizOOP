/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectExam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author M14o2
 */
public class Result {

    private Student student; //the student who took the test
    private Test test; //  the test taken by the student
    private List<Student> results = new ArrayList<>(); //  a list of all test results
    
    /**
    Constructs a new Result object with the given student and test.
    @param student the student who took the test
    @param test the test taken by the student
    */
    public Result(Student student, Test test) {
        this.student = student;
        this.test = test;

    }
    //Returns the student who took the test.
    public Student getStudent() {
        return student;
    }
    //Returns the test taken by the student.
    public Test getTest() {
        return test;
    }


}
