/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */


/*
    - determine if user is male or female (r)
    - Prompt for the amount of alcohol consumed (A)
    - Prompt user for body weight (W)
    - Prompt user for time since last drink (H)
    -
*/

import java.util.Scanner;

public class Solution17
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        double AD;

        System.out.println("Enter a 1 is you are male or a 2 if you are female: ");
        int userInput = scanR.nextInt();

        if (userInput==1)
        {
            AD = 0.73;
        }
        else if (userInput==2)
        {
            AD = 0.66;
        }
        else
        {
            AD = 0;
            System.out.println("Please enter a correct input");
        }

        System.out.println("How many ounces of alcohol did you have? ");
        int A = scanR.nextInt();

        System.out.println("What is your weight, in pounds? ");
        int W = scanR.nextInt();

        System.out.println("How many hours has it been since your last drink?" );
        int H = scanR.nextInt();



        double BAC =A*5.14/W*AD -0.015*H;

        System.out.println("Your BAC is "+ BAC);
        if (BAC >= 0.08)
        {
            System.out.println("It is not legal for you to drive.");
        }
        else
        {
            System.out.println("It is legal for you to drive.");
        }
    }
}
