package Case_Study7;

import java.util.Scanner;

class ATMAccount {

    int pin = 1234;
    double balance = 10000;

    boolean checkPin(int enteredPin) {
        return enteredPin == pin;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATMAccount account = new ATMAccount();

        boolean validPin = false;

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (account.checkPin(enteredPin)) {
                validPin = true;
                System.out.println("PIN verified successfully.");
                break;
            } else {
                System.out.println("Incorrect PIN.");
            }
        }

        if (!validPin) {
            System.out.println("Maximum attempts reached. Account locked.");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n----- ATM Menu -----");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}