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

public class Solution09
{
    public static void main(String[] args)
    {
        Scanner scanR = new Scanner(System.in);
        double feetPerGallon = 350;

        System.out.println("Enter length: ");
        double length = scanR.nextDouble();

        System.out.println("Enter width: ");
        double width = scanR.nextDouble();

        double area = length*width;
        int gallons = (int) Math.ceil(area/feetPerGallon);

        System.out.println("You will need to purchase "+gallons+" of paint to cover "+area+" square feet");
    }
}
