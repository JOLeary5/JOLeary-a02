/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Initialize Scanner
    - Prompt price/quantity item1
    - Prompt price/quantity item2
    - Prompt price/quantity item2
    - calculate subtotal
    - calculate tax
    - calculate total
 */
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner object
        
        System.out.print("Enter the price of item 1: ");
        double p1 = sc.nextDouble(); //take price of 1st item
        
        System.out.print("Enter the quantity of item 1: ");
        int q1 = sc.nextInt(); //take quantity of first item
        
        System.out.print("Enter the price of item 2: ");
        double p2 = sc.nextDouble(); //take price of 2nd item
        
        System.out.print("Enter the quantity of item 2: ");
        int q2 = sc.nextInt(); //take quantity of 2nd item
        
        System.out.print("Enter the price of item 3: ");
        double p3 = sc.nextDouble(); //taka print of 3rd item
        
        System.out.print("Enter the quantity of item 3: ");
        int q3 = sc.nextInt(); //taka quantity of 3rd item
        
        double subTotal = (p1*q1)+(p2*q2)+(p3*q3); //calculate subTotal
        double tax = (subTotal*5.5)/100; //calculate tax
        double total = subTotal+tax; //calculate final total
        
        System.out.println("Subtotal: $"+subTotal); //print output
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}
