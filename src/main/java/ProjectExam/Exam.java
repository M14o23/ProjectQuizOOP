/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectExam;

/**
 *
 * @author M14o2
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exam {

    private double score = 0;
    private double count = 0;
    private String response = "";
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    // start exam here
    public void take(String[] questions, String[][] options, String[] answers, Student student) {
        /*Create an ArrayList of integers and add all question indexes from the 'questions' array, 
        then shuffle the sequence randomly to obtain a random order of questions for the test. */
        ArrayList<Integer> randomQues = new ArrayList<>();
        for (int i = 0; i < questions.length; i++) {
            randomQues.add(i);
        }
        Collections.shuffle(randomQues);

        //The number of questions is 8
        for (int i = 0; i < 8; i++) {

            int randQus = randomQues.get(i);
            System.out.println("-------------------------------");
            System.out.println("Question " + (i + 1) + ": " + questions[randQus]);
            System.out.println("Options:");
            for (int j = 0; j < options[randQus].length; j++) {

                System.out.printf("%s. %s\n", (char) (j + 65), options[randQus][j]);
                /* along with its available options
                Uses the format method to print each option 
                with a letter label (A, B, C, etc.) for easy reference*/

            }
            System.out.print("Enter your answer: ");
            String answer = input.next();
            int ans = 0;
            if (answers[randQus].equalsIgnoreCase("A")) {
                ans = 0;
            } else if (answers[randQus].equalsIgnoreCase("B")) {
                ans = 1;
            } else if (answers[randQus].equalsIgnoreCase("C")) {
                ans = 2;
            } else if (answers[randQus].equalsIgnoreCase("D")) {
                ans = 3;
            }
            //checks if the user's answer is either equal to the correct letter choice or equal to the text of the correct answer option.
            if (answer.equalsIgnoreCase(answers[randQus]) || (answer.equalsIgnoreCase(options[randQus][ans]))) { //ans ==( A = 0), (B = 1), (C = 2), (B = 3).
                /* This switch statement generates a random number from 1 to 4 and 
                assigns the corresponding response message to the "response" variable.*/

                switch (random.nextInt(4) + 1) {
                    case 1:
                        response = "     >>>>>> Correct";
                        this.count++;
                        break;
                    case 2:
                        response = "     >>>>>> Right";
                        this.count++;
                        break;
                    case 3:
                        response = "     >>>>>> Perfect";
                        this.count++;
                        break;
                    case 4:
                        response = "     >>>>>> Good Job";
                        this.count++;
                        break;
                }
                System.out.println(response);
            } else {
                switch (random.nextInt(4) + 1) {
                    case 1:
                        response = "     !!!!!! Wrong . The correct answer is : ";
                        break;
                    case 2:
                        response = "     !!!!!! Incorrect. The correct answer is : ";
                        break;
                    case 3:
                        response = "     !!!!!! Mistaken. The correct answer is : ";
                        break;
                    case 4:
                        response = "     !!!!!! Not Right. The correct answer is : ";
                        break;
                }
                System.out.println(response + answers[randQus]);
            }

        }
        this.score = this.count / 8 * 100;
        // pass score to student
        student.setScore(this.score);
        System.out.println("--------------------");
        if ((int) this.score == this.score) {

            System.out.printf("Your score is: %.0f out of 100%%\n", this.score);
        } else {
            System.out.println("Your score is: " + this.score + "%");
        }
        System.out.printf("The correct Answers: %.0f\n", this.count);
        System.out.printf("Incorrect Answers: %.0f\n", (8 - this.count));
        System.out.println("--------------------");

    }
}
