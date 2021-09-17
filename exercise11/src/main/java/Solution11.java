/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Initialize Scanner
    - Prompt Euros
    - Prompt Euros
    - calculate dollars
    - print dollars
 */
import java.util.*;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanR = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? ");
        int euros = scanR.nextInt();

        System.out.println("What is the exchange rate? ");
        float rate = scanR.nextFloat();

        float dollars = (euros*rate);

        System.out.println(euros+" euros at an exchange rate of "+rate+" is ");

        System.out.printf("%.2f U.S dollars.",dollars);
    }
}
