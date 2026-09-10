package Case_Study9;

import java.util.Scanner;

class Student {

    String name;
    String[] courses = new String[5];
    int courseCount = 0;

    Student(String name) {
        this.name = name;
    }

    void registerCourse(String course) {

        if (courseCount < 5) {
            courses[courseCount] = course;
            courseCount++;
            System.out.println("Course registered successfully.");
        } else {
            System.out.println("You cannot register for more than 5 courses.");
        }
    }

    void displayCourses() {

        System.out.println("\n----- Registered Courses -----");
        System.out.println("Student Name: " + name);

        if (courseCount == 0) {
            System.out.println("No courses registered.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.println((i + 1) + ". " + courses[i]);
            }
        }
    }
}

public class CourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        Student student = new Student(name);

        System.out.print("Enter number of courses to register: ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Course " + (i + 1) + ": ");
            String course = sc.nextLine();

            student.registerCourse(course);
        }

        student.displayCourses();

        sc.close();
    }
}