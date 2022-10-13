/* Christopher Cao
   Homework 3
   1/27/2020 */

import java.util.Scanner;

public class rightTriangle
{
	public static void main (String[] args)
	{
		//variable & scanner declaration
		double a;
		double b;
		double c;
		Scanner scanner = new Scanner (System.in);
		
		//prompt for user input
		System.out.println("Please enter the first value:");
		a = scanner.nextInt();
		System.out.println("Please enter the second value:");
		b = scanner.nextInt();
		System.out.println("Please enter the third value:");
		c = scanner.nextInt();
		scanner.close();
		
		//output if the values can be the sides of a right triangle
		if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
		{
			System.out.println("These values can represent the sides of a right triangle.");
		}
		//output if the values cannot be the sides of a right triangle
		else
		{
			System.out.println("These values cannot represent the sides of a right triangle.");
		}
	}
}
