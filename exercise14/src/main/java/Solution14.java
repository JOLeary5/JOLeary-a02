/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */


/*
    - prompt OrderAmount
    - prompt the State
    - Calculate and display subtotal
    - Calculate and display tax
    - Calculate and display total
*/

import java.util.Scanner;

public class Solution14
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        double orderAmount, tax;
        String state;

        System.out.print("What is the order amount? ");
        orderAmount = scanR.nextDouble();

        System.out.print("What is the state? ");
        state = scanR.next();

        if(state.equalsIgnoreCase("WI"))
        {
            System.out.printf("The subtotal is $%.2f\n", orderAmount);

            tax = 5.5/10;
            System.out.printf("The tax is $%.2f\n", tax);
        }
        else
        {
            tax = 0;
        }
        double total = orderAmount + tax;
        System.out.printf("The total is $%.2f\n", total);
    }
}
