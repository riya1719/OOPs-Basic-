/*
 * Program to demonstrate Difference in lines of code in switch and If Else using a scenario
 */
package minipro;

import java.util.Scanner;

public class SwitchAndIfElseDifference
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);

	// Take input from user as integer called number
			System.out.print("Enter a number: ");
			int number = scan.nextInt();
			
			System.out.println("Using If Else");
			
			if (number < 10)
			 {
				if (number < 5 )
				System.out.println("Hiee");
				}
	
			else if (number > 10)
			 System.out.println("Bye");
			
			else 
				 System.out.println("Default");


			
			
			System.out.println("Using Switch Case");
			
			switch(number)
			{
			case(0): 
			case(1):
			case(2):
			case(3):
			case(4):
				{
				System.out.println("Hiee");
				break;
				}
			
			case(11):
			case(12):
				{
				System.out.println("Bye");
				break;
				}
			default:System.out.println("Default");

			}

			


}
}
