/* Christopher Cao
   Homework 4
   2/3/2020 */

import java.util.Scanner;

public class CalculatingSales
{
	public static void main (String[] args)
	{
		//variable declaration
		int product;
		int product1 = 0;
		int product2 = 0;
		int product3 = 0;
		int product4 = 0;
		int product5 = 0;
		int productTotal = 0;
		double profit1;
		double profit2;
		double profit3;
		double profit4;
		double profit5;
		double profitTotal;
		
		//prompt for user input
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter the product number (1-5) or enter 0 to view a profit summary.");
		product = scanner.nextInt();
		
		//while the sentinel value (0) is not entered for product
		while (product != 0)
		{
			//if a valid product number is entered
			if (product >= 1 && product <= 5)
			{
				switch (product)
				{
					case 1:
					{
						System.out.println("Please enter the quantity of product 1 sold.");
						product1 += scanner.nextDouble();
						break;
					}
					case 2:
					{
						System.out.println("Please enter the quantity of product 2 sold.");
						product2 += scanner.nextDouble();
						break;
					}
					case 3:
					{
						System.out.println("Please enter the quantity of product 3 sold.");
						product3 += scanner.nextDouble();
						break;
					}
					case 4:
					{
						System.out.println("Please enter the quantity of product 4 sold.");
						product4 += scanner.nextDouble();
						break;
					}
					case 5:
					{
						System.out.println("Please enter the quantity of product 5 sold.");
						product5 += scanner.nextDouble();
						break;
					}
				}
			}
			//if an invalid product number is entered
			else
			{
				System.out.println("Please enter a valid product number (1-5) or enter 0 to view a profit summary.");
				product = scanner.nextInt();
			}
			//prompt for user input
			System.out.println("Please enter the product number (1-5) or enter 0 to view a profit summary.");
			product = scanner.nextInt();
		}
		
		//calculations
		profit1 = product1 * 2.98;
		profit2 = product2 * 4.50;
		profit3 = product3 * 9.98;
		profit4 = product4 * 4.49;
		profit5 = product5 * 6.87;
		productTotal = product1 + product2 + product3 + product4 + product5;
		profitTotal = profit1 + profit2 + profit3 + profit4 + profit5;
		
		//final output
		scanner.close();
		System.out.println("\nProduct 1 made " + product1 + " sale(s) for a value of $" + String.format("%.2f", profit1) + ".");
		System.out.println("Product 2 made " + product2 + " sale(s) for a value of $" + String.format("%.2f", profit2) + ".");
		System.out.println("Product 3 made " + product3 + " sale(s) for a value of $" + String.format("%.2f", profit3) + ".");
		System.out.println("Product 4 made " + product4 + " sale(s) for a value of $" + String.format("%.2f", profit4) + ".");
		System.out.println("Product 5 made " + product5 + " sale(s) for a value of $" + String.format("%.2f", profit5) + ".");
		System.out.println("A total of " + productTotal + " sale(s) were made for a final value of $" + String.format("%.2f", profitTotal) + ".");
	}
}
