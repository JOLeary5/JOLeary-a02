/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Get Scanner
    - Initialize people/pizzas/pizzaSlices (A-B-C)
    - Display string confirming information
    - ( A / ( B * C)) -- equation for calculating slices per person
    - Display the calculation string
 */

import java.util.Scanner;

public class Solution08
{
    public static void main(String[] args)
    {
        int people=0, pizza=0, slice=0, slicePerPerson, evenTest;

        Scanner scanR = new Scanner(System.in);

        System.out.println("How many people? ");
        String peopleString = scanR.nextLine();

        System.out.println("How many pizzas do you have? ");
        String pizzaString = scanR.nextLine();

        System.out.println("How many Slices per pizza? ");
        String sliceString = scanR.nextLine();

        try
        {
            people = Integer.parseInt(peopleString);
            pizza = Integer.parseInt(pizzaString);
            slice = Integer.parseInt(sliceString);
        }
        catch (NumberFormatException ex)
        {
            ex.printStackTrace();
        }

        System.out.println(people + " people with " + pizza + " pizzas (" + pizza*slice + " slices)");

        slicePerPerson = ((slice*pizza) / people);
        evenTest = ((slice*pizza) % people);

        if (evenTest != 0)
        {
            System.out.println("Each person gets "+ slicePerPerson +" pieces of pizza.\nThere are " + evenTest + " leftover pieces.");
        }
        else
        {
            System.out.println("Each person gets "+ slicePerPerson +" pieces of pizza.\nThere are no leftover pieces.");
        }
    }
}
