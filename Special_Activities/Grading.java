package Special_Activities;
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //Get the user input
            System.out.printf("You can know the grade in here...");
            System.out.print("Enter the marks : ");
            double marks = scanner.nextDouble();

            if (marks >= 0 && marks <= 100) {
                if (marks >= 75) {
                    System.out.println("You have A pass");
                } else if (marks >= 65) {
                    System.out.println("You have B pass");
                } else if (marks >= 55) {
                    System.out.println("You have C pass");
                } else if (marks > 35) {
                    System.out.println("You have S pass");
                } else {
                    System.out.println("You failed... Try agein...");
                }
            } else {
                System.out.println("Invalid input (pls enter only the 0-100 numbers");
            }
            System.out.println("Enter -1 to exit...");
            if(marks == -1) {
                System.out.println("Thank you for join with us...");
                break;
            }
        }
    }
}
