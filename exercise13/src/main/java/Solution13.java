/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */


/*
    - prompt P (Principal Amount)
    - prompt r (Rate)(Float)
    - prompt t (Years)
    - prompt n (Compounded Interest)
    - calculate investment growth A = P(1 + r/n)^(n*t)
    - print result string
 */
import java.util.*;

public class Solution13
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        int P, n ,t;
        double A;
        float r;

        System.out.println("What is the principal amount? ");
        P = scanR.nextInt();

        System.out.println("What is the rate? ");
        r = scanR.nextFloat();

        System.out.println("What is the number of years? ");
        t = scanR.nextInt();

        System.out.println("What is the number of times the interest is compounded per year? ");
        n = scanR.nextInt();

        A = P*Math.pow(1+((r*0.01)/n),n*t);

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", P, r, t, n, A);
    }
}
