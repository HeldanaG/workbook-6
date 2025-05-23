package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nAdd a new asset to your portfolio:");
            System.out.println("1. Bank Account");
            System.out.println("2. Credit Card");
            System.out.println("3. Jewelry");
            System.out.println("4. House");
            System.out.println("5. Gold");
            System.out.println("0. Exit and Show Portfolio");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String baName = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String baNum = scanner.nextLine();
                    System.out.print("Enter balance: ");
                    double baBal = Double.parseDouble(scanner.nextLine());
                    portfolio.addAsset(new BankAccount(baName, baNum, baBal));
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String ccName = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String ccNum = scanner.nextLine();
                    System.out.print("Enter balance: ");
                    double ccBal = Double.parseDouble(scanner.nextLine());
                    portfolio.addAsset(new CreditCard(ccName, ccNum, ccBal));
                    break;

                case 3:
                    System.out.print("Enter jewelry name: ");
                    String jName = scanner.nextLine();
                    System.out.print("Enter karat value: ");
                    double jKarat = Double.parseDouble(scanner.nextLine());
                    portfolio.addAsset(new Jewelry(jName, jKarat));
                    break;

                case 4:
                    System.out.print("Enter year built: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter square feet: ");
                    int sqft = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter number of bedrooms: ");
                    int beds = Integer.parseInt(scanner.nextLine());
                    portfolio.addAsset(new House(year, sqft, beds));
                    break;

                case 5:
                    System.out.print("Enter weight of gold: ");
                    double weight = Double.parseDouble(scanner.nextLine());
                    portfolio.addAsset(new Gold(weight));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice !=0);

        System.out.println("Total Net Worth: $" + portfolio.getValue());

        Valuable most = portfolio.getMostValuable();
        Valuable least = portfolio.getLeastValuable();

        System.out.println("Most Valuable: " + most.getClass().getSimpleName() + " ($" + most.getValue() + ")");
        System.out.println("Least Valuable: " + least.getClass().getSimpleName() + " ($" + least.getValue() + ")");
    }
}
