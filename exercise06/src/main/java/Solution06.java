/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Initialize Scanner
    - DEFINE (Age, rAge, AgeDiff)
    - Prompt for Age, rAge
    - Calculate (AgeDiff = [rAge-Age])
    - display AgeDiff
    - Add AgeDiff to
            and Display current year somehow<--
 */
import java.util.*;

public class Solution06
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        int Age, rAge, AgeDiff;

        System.out.println("What is your current age?");
        Age = scanR.nextInt();
        System.out.println("At what age would you like to retire? ");
        rAge = scanR.nextInt();

        AgeDiff = (rAge - Age);

        System.out.println("You have " +AgeDiff+ " years before you can retire.");

        // Current year variable
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int rYear = AgeDiff + currentYear;

        System.out.println( "It's " + currentYear+ ", so you can retire in " + rYear);
    }
}
