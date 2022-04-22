/*
 * Program to demonstrate usage of for , while and do while loop
 */
package demo;

public class ForWhileAndDoWhile {

	public static void main(String[] args) 
	{
		int i = 1;

		System.out.println("For Loop");

		for ( i=1 ; i<=5;i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		System.out.println("Do While Loop");
		do 
		{
			System.out.print(i + " ");
			i++;

		}		
		while (i <= 5);
		System.out.println();

		
		System.out.println("While Loop");
		while(i !=0)
		{
			System.out.print(i + " ");
			i--;

		}
		
		
		
			
	}
}
