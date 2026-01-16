package halimJavaCode;
import java.util.Scanner;

public class GradeAndAverageCalculatorRST {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user for number of grades
        System.out.print("Enter number of grades: ");
        int numGrades = input.nextInt();

        if (numGrades <= 0) {
            System.out.println("Error: Number of grades must be greater than 0.");
            return;
        }

        int sum = 0;

        // Ask user to enter each grade
        for (int i = 1; i <= numGrades; i++) {
            int grade;

            do {
                System.out.print("Enter grade " + i + " (0–100): ");
                grade = input.nextInt();

                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                }

            } while (grade < 0 || grade > 100);

            sum += grade;
        }

        // Calculate average
        double average = (double) sum / numGrades;

        // Determine letter grade based on average
        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Pass or Fail decision
        String result;
        if (letterGrade == 'F') {
            result = "FAILED";
        } else {
            result = "PASSED";
        }

        // Display results
        System.out.println("\n--- Final Results ---");
        System.out.println("Average grade: " + average);
        System.out.println("Letter grade: " + letterGrade);
        System.out.println("You have " + result + " the class.");

        input.close();
    }
}