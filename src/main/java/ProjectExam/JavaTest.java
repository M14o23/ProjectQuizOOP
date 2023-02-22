/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectExam;

import java.util.Scanner;

/**
 *
 * @author M14o2
 */
public class JavaTest extends Exam implements Test {

    Scanner input = new Scanner(System.in);

    // this is questions
    private static String[] questions = {
        "What is a correct syntax to output \"Hello World\" in Java?",
        "Java is short for \"JavaScript\".",
        "How do you insert COMMENTS in Java code?",
        "Which data type is used to create a variable that should store text?",
        "How do you create a variable with the numeric value 5?",
        "Which method can be used to find the length of a string?",
        "Which operator is used to add together two values?",
        "Which operator can be used to compare two values?",
        "To declare an array in Java, define the variable type with:",
        "Array indexes start with:",
        "How do you create a method in Java?",
        "How do you call a method in Java?",
        "What is the correct way to create an object called myObj of MyClass?",
        "Which method can be used to find the highest value of x and y?",
        "Which operator is used to multiply numbers?",
        "Which statement is used to stop a loop?"

    };
    // this is options
    private static String[][] options = {
        {"print (\"Hello World\");", "echo(\"Hello World\");", "Console.WriteLine(\"Hello World\");", "System.out.println(\"Hello World\");"},
        {"True", "False"},
        {"# This is a comment", "// This is a comment", "/* This is a comment"},
        {"myString", "String", "string", "Txt"},
        {"float x = 5;", "x = 5;", "num x = 5", "int x = 5;"},
        {"getSize()", "len()", "getLength()", "length()"},
        {"The * sign", "The + sign", "The & sign"},
        {"=", "==", "<>", "><"},
        {"()", "{}", "[]"},
        {"0", "1"},
        {"methodName()", "(methodName)", "methodName.", "methodName[]"},
        {"methodName();", "(methodName);", "methodName;", "methodName[];"},
        {"class MyClass = new myObj();", "MyClass myObj = new MyClass();", "class myObj = new MyClass();", "new myObj = MyClass();"},
        {"Math.maxNum(x,y)", "Math.largest(x,y)", "Math.max(x,y)", "Math.maximum(x,y)"},
        {"X", "%", "*", "#"},
        {"break", "stop", "exit", "return"},};
    // this is answers
    private static String[] answers = {"D", "B", "B", "B", "D", "D", "B", "B", "C", "A", "A", "A", "B", "C", "C", "A"};

    @Override
    public void take(Student student) {
        //passing the questions, options, answers, and student
        take(questions, options, answers, student);

    }
}
