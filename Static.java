/*
 * 1. Program to define usage of static variables and 
 * default constructor by incrementing the static variables
 */

package demo2;

public class Static {
	
	static int x;
	static float y;

	
	{
		System.out.println("Initial values of x: " + x);
		System.out.println("Initial values of y: " + y);

	}

	Static () // Constructor
	{
		x = 5;
		y = 10.55f;
		
		System.out.println("After constructor call value of x: " + x);
		System.out.println("After constructor call value of y: " + y);
		

		
	}
	
	static void Increment()
	{
		x++;
		y++;
	
		System.out.println("After incrementing value of x: " + x);
		System.out.println("After incrementing value of y: " + y);
	}
	
	
	
	

	public static void main(String[] args) {
		

		// creating an object for calling Static constructor
		Static  obj = new Static (); 
		
		Increment();

		
		
		
		
		
		
		
		
	}
		
}
