/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectExam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author M14o2
 */
public class StudentDatabase {

    public List<Result> results = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    // add information to List results
    public void addResult(Result result) {
        results.add(result);
    }
    // add student(name,number) and test
    public void addResult(Student student, Test test) {
        // new object from Result
        Result res = new Result(student, test);
        //pass res
        addResult(res);
    }
    // display Result 
    public void displayResults() {
        // if null
        if (results.isEmpty()) {
            System.out.println("No results to display");
        } else {
            System.out.println("+-----------------+---------------+------------------+--------+");
            System.out.println("|      Name       |    Number     |      Test        | Score  |");
            System.out.println("+-----------------+---------------+------------------+--------+");
            // for each to print all in results
            for (Result result : results) {
                String name = result.getStudent().getName();
                int number = result.getStudent().getNumber();
                String testName = result.getTest().getClass().getSimpleName();
                double score = result.getStudent().getScore();
                System.out.printf("| %-15s | %-13d | %-15s | %-5.1f%% |\n", name, number, testName, score);
            }
            System.out.println("+-----------------+---------------+------------------+--------+");
        }

    }
        //delete result
    public boolean deleteResultByName() {
        boolean removed = false;
        // print all 
        for (Result result : results) {
            System.out.println("---------------------------------------");
            System.out.println("Name: " + result.getStudent().getName());
            System.out.println("Number: " + result.getStudent().getNumber());
            System.out.println("Test: " + result.getTest().getClass().getSimpleName());
            System.out.println("Score: " + result.getStudent().getScore() + "%");
            System.out.println("---------------------------------------");
        }
        // delete username from user
        System.out.println("Choose the name you want to delete ?");
        String name = input.next();
        Iterator<Result> iterator = results.iterator();
        while (iterator.hasNext()) {
            Result result = iterator.next();
            if (name.equals(result.getStudent().getName())) {
                iterator.remove();
                removed = true;
                //return true
            }
        }

        return removed;
    }
            // check username 
    public String userName() {
        boolean nameAvailable = true;
        String name;

        do {
            nameAvailable = true;
            System.out.print("Enter your name: ");
            name = input.next();
            for (Result result : results) {
                if (name.equals(result.getStudent().getName())) {
                    System.out.println("This name is not available. Please choose another name!");
                    nameAvailable = false;
                    break;
                }
            }
        } while (!nameAvailable);

        return name;

    }
                // check user number  
    public int userNum() {
        boolean nameAvailable = true;
        int number;
        do {
            nameAvailable = true;
            System.out.print("Enter your number: ");
            number = input.nextInt();
            for (Result result : results) {
                if (number == result.getStudent().getNumber()) {
                    System.out.println("This number is not available. Please choose another number!");
                    nameAvailable = false;
                    break;
                }
            }
            // if false return 
        } while (!nameAvailable);
        return number;
    }

}
