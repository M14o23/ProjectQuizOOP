/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectExam;

/**
 *
 * @author M14o2
 */
public class Student {
    // instance variables to store student name, student number, and score
    private String name;
    private int number;
    private double score;
    
    /**
    Constructor for creating a new student object
    @param name the name of the student
    @param number the student number
    */
    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    //Getter method to return the name of the student
    public String getName() {
        return name;
    }
    //Getter method to return the number of the student
    public int getNumber() {
        return number;
    }
    //Getter method to return the score of the student
    public double getScore() {
        return this.score;
    }
    //Setter method to set the student score
    public void setScore(double score) {
        this.score = score;
    }
}
