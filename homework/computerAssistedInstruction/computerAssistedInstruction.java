// Christopher Cao
// ch282858
// COP3330 - Spring 2020

import java.security.SecureRandom;
import java.util.Scanner;

public class computerAssistedInstruction
{
	public static int question()
	{
		//variable declaration
		SecureRandom rand = new SecureRandom();
		int integer1 = rand.nextInt(10);
		int integer2 = rand.nextInt(10);
		int product = integer1 * integer2;
		
		//prompt for user input
		System.out.println("How much is " + integer1 +  " times " + integer2 + "?");
		
        return product;
	}

	public static void main(String args[])
	{
		//variable & scanner declaration
		int input;
		int answer;
		Scanner scanner = new Scanner(System.in);
		answer = question();
		
		//loop to read & compare input to answer
		while (true)
		{
			input = scanner.nextInt();
			
			//loop for correct input
			if (input == answer)
			{
				System.out.println("Very good!");
				answer = question();
			}
			
			//loop for incorrect input
			else
			{
				System.out.println("No. Please try again.");
			}
		}
	}
}