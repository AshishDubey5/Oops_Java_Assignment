package Case_Study4;

import java.util.Scanner;

class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    double calculateCost() {
        return price * quantity;
    }

    void displayProduct() {
        double cost = calculateCost();

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + cost);
        System.out.println();
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        double totalBill = 0;

        for (int i = 0; i < n; i++) {

            products[i] = new Product();

            System.out.println("\nEnter details for Product " + (i + 1));

            System.out.print("Enter Product ID: ");
            products[i].productId = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Product Name: ");
            products[i].productName = sc.nextLine();

            System.out.print("Enter Price: ");
            products[i].price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            products[i].quantity = sc.nextInt();

            totalBill = totalBill + products[i].calculateCost();
        }

        System.out.println("\n----- Shopping Cart -----");

        for (int i = 0; i < n; i++) {
            products[i].displayProduct();
        }

        double discount = 0;

        if (totalBill > 5000) {
            discount = totalBill * 0.10;
        }

        double finalBill = totalBill - discount;

        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);

        sc.close();
    }
}