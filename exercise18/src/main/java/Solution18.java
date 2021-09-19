/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - prompt fahrenheit or Celsius
    - have them enter a temp
    - calculate temp based on user choice
 */

import java.util.*;

public class Solution18
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        String userInput, userUpper, temp, cT="C",fT="F";
        double c=0,f=0, main=0;

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        userInput = (scanR.next());
        userUpper = userInput.toUpperCase();

        System.out.println("Your Choice: "+ userUpper);

        if (userUpper == fT)
        {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            f = scanR.nextDouble();;
            c =(f-32)*5/9;
            temp = "Fahrenheit";
            main = c;
        }
        else if (userUpper == cT)
        {
            System.out.println("Please enter the temperature in Celsius: ");
            c = scanR.nextDouble();;
            f=((9*c)/5)+32;
            temp = "Fahrenheit";
            main = f;
        }
        else
        {
            System.out.println("INVALID SELECTION");
            temp = "Error";
        }
        System.out.println("The temperature in "+temp+" is "+main);
    }
}
