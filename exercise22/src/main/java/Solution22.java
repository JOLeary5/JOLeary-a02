/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Ask user for 2 numbers
    - Display highest number
 */

import java.util.Scanner;

public class Solution22
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        int userNumber = 0, HighestNumber=0;

        System.out.println("Enter the first number: ");
        userNumber = scanR.nextInt();
        if (userNumber>HighestNumber)
        {
            HighestNumber=userNumber;
        }

        System.out.println("Enter the second number: ");
        userNumber = scanR.nextInt();
        if (userNumber>HighestNumber)
        {
            HighestNumber=userNumber;
        }

        System.out.println("Enter the third number: ");
        userNumber = scanR.nextInt();
        if (userNumber>HighestNumber)
        {
            HighestNumber=userNumber;
        }

        System.out.println("The largest number is "+ HighestNumber);
    }
}
