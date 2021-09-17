/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */


/*
    - Prompt user Age
    - Display if they can drive
*/

import java.util.Scanner;

public class Solution16
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        int UserAge, DrivingAge;
        String are;
        DrivingAge = 16;
        System.out.println("What is your age: ");
        UserAge = scanR.nextInt();

        if (UserAge>=DrivingAge)
        {
            are = "are";
        }
        else
        {
            are = "are not";
        }

        System.out.println("You "+are+" old enough to drive");
    }
}
