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

public class Menu {

    StudentDatabase database = new StudentDatabase();
    Scanner input = new Scanner(System.in);
    String anotherTest;

    //  print menu
    private static void displayMenu() {
        System.out.println("---Menu---");
        System.out.println("1. Take a test");
        System.out.println("2. View results");
        System.out.println("3. delete results");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Run the program
    public void run() {
        while (true) {
            displayMenu();
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:   
                    //1. Take a test
                    takeTest();
                    break;
                case 2:
                    //2. View results
                    database.displayResults();
                    break;
                case 3:
                    //3. delete results
                    if (database.results.isEmpty()) {
                        System.out.println("No results to display");
                    } else {
                        if (database.deleteResultByName()) {
                            System.out.println("deleted Successfuly ");
                        } else {
                            System.out.println("deleted fails");
                        }
                    }
                    break;
                case 4:
                    //4. Exit
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    private void takeTest() {
        String name = database.userName();
        // return name from user
        int number = database.userNum();
        // return number from user
        do {           //do while because To enter at least once
            
            Student student = new Student(name, number);
            int testChoice = chooseTest();
            Test test = null;
             //Test selection
            switch (testChoice) {
                case 1:
                    test = new MathematicsTest();
                    break;
                case 2:
                    test = new JavaTest();
                    break;
                case 3:
                    test = new HistoryTest();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    return;

            }
            // go in test
            test.take(student);
            //pass information
            database.addResult(student, test);
            System.out.println("Do you want another Test? Y/N ");
            anotherTest = input.next();
        } while (anotherTest.equalsIgnoreCase("Y") || anotherTest.equalsIgnoreCase("YES"));

        run();
    }

    private int chooseTest() {
        //What do you want to test
        System.out.println("Choose a test:");
        System.out.println("1. Math Test");
        System.out.println("2. Java Test");
        System.out.println("3. History Test");
        System.out.print("Enter your choice: ");

        return input.nextInt();
    }
}
