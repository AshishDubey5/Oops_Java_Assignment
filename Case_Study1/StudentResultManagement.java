import java.util.Scanner;

class Student {
    String name;
    double[] marks = new double[5];
    double total;
    double percentage;
    String grade;
    String result;

    void calculateResult() {
        total = 0;

        for (double mark : marks) {
            total += mark;
        }

        percentage = total / 5;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        if (percentage >= 50)
            result = "PASS";
        else
            result = "FAIL";
    }

    void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name       : " + name);
        System.out.println("Total      : " + total + " / 500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
        System.out.println("Result     : " + result);
    }
}

public class StudentResultManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            student.marks[i] = scanner.nextDouble();
        }

        student.calculateResult();
        student.displayResult();

        scanner.close();
    }
}