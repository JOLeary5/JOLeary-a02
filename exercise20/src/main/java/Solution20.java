/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Prompt Order Amount
    - Determine what State the user is in
        - If (Wisconsin) then prompt for county
        - If (Illinois) calculate tax
        - No other state has special tax
    - print the results
 */
import java.util.*;

public class Solution20
{
    public static void main(String[] args) {
        Scanner scanR = new Scanner(System.in);
        double tax=0, tAmount=0;

        System.out.println("What is order amount? ");
        int Amount = scanR.nextInt();

        System.out.println("What state do you live in? ");
        String State =scanR.next();

        if (State.equals("Wisconsin"))
        {
            System.out.println("What county do you live in? ");
            String County = scanR.next();

            if(County.equals("EauClaire"))
            {
                tax = (Amount*5.005)/100;
                tAmount = tax + Amount;
            }
            else if(County.equals("Dunn"))
            {
                tax = (Amount*5.005)/100;
                tAmount = tax + Amount;
            }
            else
            {
                System.out.println("Please enter correct County");
            }
        }
        else if (State.equals("Illinois"))
        {
            tax = (Amount*8)/100;
            tAmount = tax + Amount;
        }
        else
        {
            tax=0;
            tAmount = Amount;
        }
        System.out.println("The tax is  $"+String.format("%.2f",tax)+"\nThe total is $"+ String.format("%.2f",tAmount));
    }
}
