/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.franchisesales;

/**
 *
 * @author Student
 */
 import java.util.Scanner;
public class ElectronicsSalesConsole extends FranchiseSales {
    

// 1. THE CONSOLE INTERFACE
public interface IConsoleSales {
    String getConsoleType();
    String getStore();
    int getTotalSales();
    void displayReport();
    double calculateVat(double amount); // Example utility method
}

// 2. THE CONSOLE CLASS

class ElectronicStoreConsole implements IConsoleSales {
    // Variables to store console data
    private String consoleType;
    private String storeName;
    private double totalAmount;

    // Constructor that accepts the console type, store name, and amount as parameters
    public ElectronicStoreConsole(String consoleType, String storeName, double totalAmount) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalAmount = totalAmount;
    }

    // Getter methods to retrieve the values
    public String getConsoleType() {
        return consoleType;
    }

    public String getStoreName() {
        return storeName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Implementing the mandatory displayReport method from the Interface
    @Override
    public void displayReport() {
        System.out.println("\n=================================================");
        System.out.println("         ELECTRONIC STORE SALES REPORT           ");
        System.out.println("=================================================");
        System.out.printf("%-20s: %s%n", "Store Name", storeName);
        System.out.printf("%-20s: %s%n", "Console Device Type", consoleType);
        System.out.printf("%-20s: R %,.2f%n", "Total Sales Amount", totalAmount);
        System.out.printf("%-20s: R %,.2f%n", "Estimated VAT (15%)", calculateVat(totalAmount));
        System.out.println("=================================================");
    }

    // Implementing the mandatory calculateVat method from the Interface
    @Override
    public double calculateVat(double amount) {
        return amount * 0.15; // Standard 15% VAT calculation
    }
}

// 3. MAIN RUNNER CLASS (The Console User Interface)
public class FranchiseApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- NUMBER 1 ELECTRONICS DATA ENTRY ---");

        // Functionality to select a console device type
        System.out.println("Select Console Device Type:");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox Series X");
        System.out.println("3. Nintendo Switch");
        System.out.println("Enter choice (1-3): ");
        int choice = input.nextInt();
        input.nextLine(); // Clear the scanner buffer

        String selectedConsole = "";
        switch (choice) {
            case 1 -> selectedConsole = "PlayStation 5";
            case 2 -> selectedConsole = "Xbox Series X";
            case 3 -> selectedConsole = "Nintendo Switch";
            default -> selectedConsole = "Unknown Console";
        }

        // Functionality to enter store name
        System.out.print("Enter Store Name (e.g., Johannesburg Central): ");
        String store = input.nextLine();

        // Functionality to enter total amount
        System.out.print("Enter Total Sales Amount for this store (R): ");
        double amount = input.nextDouble();

        // Instantiate the console class using the constructor parameters
        ElectronicStoreConsole static storeReport = new ElectronicStoreConsole(selectedConsole, store, amount);

        // Run the implemented interface method to print the final data
        storeReport.displayReport();
        
        input.close();
    }
}


