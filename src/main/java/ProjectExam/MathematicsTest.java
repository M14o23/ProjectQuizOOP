/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectExam;

/**
 *
 * @author M14o2
 */
import java.util.Scanner;

public class MathematicsTest extends Exam implements Test {

    Scanner input = new Scanner(System.in);
    // this is questions
    private static String[] questions = {
        "What is the sum of 2 + 2?",
        "What is the product of 3 and 5?",
        "What is the square root of 9?",
        "What is the sum of 6 and 7?",
        "What is the product of 3 and 8?",
        "What is the difference between 9 and 4?",
        "What is the quotient of 15 divided by 3?",
        "What is the value of 2 to the power of 4?",
        "What is the square root of 64?",
        "What is the product of 5 and 0?",
        "What is the value of 10 percent of 80?",
        "What is the value of 6 multiplied by 9?",
        "What is the sum of 3/4 and 2/3?",
        "What is the value of pi (rounded to two decimal places)?",
        "What is the sum of the first 5 positive integers?",
        "What is the product of -5 and 6?",
        "What is the value of 1/3 plus 2/3?",
        "What is the difference between 10 and -4?"

    };
    // this is options
    private static String[][] options = {
        {"3", "4", "5", "6"},
        {"7", "8", "15", "20"},
        {"2", "3", "4", "5"},
        {"11", "12", "13", "14"},
        {"20", "21", "22", "24"},
        {"3", "4", "5", "6"},
        {"3", "4", "5", "6"},
        {"4", "8", "16", "32"},
        {"4", "6", "8", "10"},
        {"0", "1", "5", "10"},
        {"8", "16", "32", "64"},
        {"42", "45", "48", "54"},
        {"1/2", "5/6", "1 7/12", "1 5/12"},
        {"3.12", "3.14", "3.16", "3.18"},
        {"10", "12", "14", "15"},
        {"-11", "-30", "30", "36"},
        {"1/3", "2/3", "1", "4/3"},
        {"4", "6", "10", "14"}
    };
    // this is answers
    private static String[] answers = {"B", "C", "B", "C", "D", "C", "A", "C", "C", "A", "B", "D", "D", "B", "D", "C", "C", "D"};

    @Override
    public void take(Student student) {
        //passing the questions, options, answers, and student
        take(questions, options, answers, student);

    }
}
