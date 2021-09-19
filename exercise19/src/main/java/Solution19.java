/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Prompt user for height
    - Prompt user for weight
    - A loop to make sure those are valid
 */

import java.util.*;

public class Solution19
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        double weight, height;

        System.out.println("Enter your weight: ");
        weight = scanR.nextDouble();

        System.out.println("Enter your height: ");
        height = scanR.nextDouble();

        double bmi = (weight * 703) / (height);
        System.out.println("Your BMI is "+ bmi);

        if (bmi >=18.5 && bmi <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }

    }
}
