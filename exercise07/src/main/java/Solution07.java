/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Initialize Scanner
    - Prompt length
    - Prompt width
    - calculate area in feet (Display)
    - calculate area in Meters (Display)
 */
import java.util.*;

public class Solution07
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);

        System.out.println("What is the length of the room in feet? ");
        int length = scanR.nextInt();
        System.out.println("What is the width of the room in feet? ");
        int width = scanR.nextInt();

        int area = length*width;
        double meters = area*.09290304;
        System.out.println("The area is\n" + area + " square meters\n" + meters+ " square meters");
    }

}
