package Case_Study6;

import java.util.Scanner;

class Patient {

    int patientId;
    String name;
    int age;
    double temperature;

    void displayPatient() {
        System.out.println("\n----- Patient Details -----");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + "°F");

        if (temperature > 100.4) {
            System.out.println("Status: Fever");
        } else {
            System.out.println("Status: Normal");
        }
    }
}

public class PatientManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient patient = new Patient();

        System.out.print("Enter Patient ID: ");
        patient.patientId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        patient.name = sc.nextLine();

        System.out.print("Enter Age: ");
        patient.age = sc.nextInt();

        System.out.print("Enter Temperature in Fahrenheit: ");
        patient.temperature = sc.nextDouble();

        patient.displayPatient();

        sc.close();
    }
}