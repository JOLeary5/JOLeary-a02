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

public class Solution15
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);

        String Passcode = "abc$123";

        System.out.println("What is the password? ");
        String userInput = scanR.next();

        if (userInput.equals(Passcode))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("UNAUTHORIZED USER, PREPARE FOR TERMINATION");
        }
    }
}

