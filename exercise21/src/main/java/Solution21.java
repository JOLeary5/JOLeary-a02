/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Ask for number of month
    - switch case
    - Output statement
 */

import java.util.*;


public class Solution21
{
    public static void main(String[] args) {
        Scanner scanR = new Scanner(System.in);

        int Month;
        System.out.println("Please enter the number of month: ");
        Month = scanR.nextInt();
        String MonthName;

        switch (Month)
        {
            case 1: MonthName = "January";
            break;

            case 2: MonthName = "February";
            break;

            case 3: MonthName = "March";
            break;

            case 4: MonthName = "April";
            break;

            case 5: MonthName = "May";
            break;

            case 6: MonthName = "June";
            break;

            case 7: MonthName = "July";
            break;

            case 8: MonthName = "August";
            break;

            case 9: MonthName = "September";
            break;

            case 10: MonthName = "October";
            break;

            case 11: MonthName = "November";
            break;

            case 12: MonthName = "December";
            break;

            default: MonthName = "Invalid Selection";
            break;
        }
        System.out.println("The name of the month is "+MonthName);
    }
}
