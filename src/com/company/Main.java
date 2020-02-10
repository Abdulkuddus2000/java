package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to te Invoice Total Calculator");
        System.out.println();

        //Get the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subtotal: ");
        double subtotal = sc.nextDouble();

        //Calculate the discount amount and total
        double discountPercent = .2;
        double discountAmount = subtotal * discountPercent;
        double invoiceTotal = subtotal - discountAmount;

        //Format and display the result
        String message = "Discount percent: " +discountPercent + "\n"
                + "Discount amount: " + discountAmount + "\n"
                +"Invoice total: " + invoiceTotal + "\n";
        System.out.println(message);
    }
}
