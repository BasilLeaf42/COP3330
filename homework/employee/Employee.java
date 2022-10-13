// Christopher Cao
// ch282858
// COP3330 - Spring 2020

import java.util.Scanner;

public class Employee
{
	//instance variables
	private String firstName;
	private String lastName;
	private double initialSalary;
	
	public Employee(String first, String last, double salary)
	{
		//variable declaration
		firstName = first;
		lastName = last;
		initialSalary = salary;
	}
	
	//firstName statements
	public void setFirstName(String first)
	{
		firstName = first;
	}
	public String getFirstName()
	{
		return firstName;
	}

	//lastName statements
	public void setLastName(String last)
	{
		lastName = last;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	//initialSalary statements
	public void setInitialSalary(double salary)
	{
		initialSalary = salary;
	}
	public double getInitialSalary()
	{
		return initialSalary;
	}
}

class EmployeeTest
{
	public static void main(String[] args)
	{
		//variable declaration
		double raise = 1.1;
		double annualSalaryA = 0.0;
		double annualSalaryB = 0.0;
		double raisedSalaryA = 0.0;
		double raisedSalaryB = 0.0;
		
		//test employees
		Employee a = new Employee("John", "Doe", 10);
		Employee b = new Employee("Jane", "Roe", 1);
		
		//calculations for initial and raised annual salaries
		annualSalaryA = a.getInitialSalary() * 12;
		raisedSalaryA = annualSalaryA * raise;
		annualSalaryB = b.getInitialSalary() * 12;
		raisedSalaryB = annualSalaryB * raise;
		
		//final output
		System.out.println(a.getFirstName() + " " + a.getLastName() + "'s initial annual salary was $"  + String.format("%.2f", annualSalaryA) + ".");
		System.out.println(a.getFirstName() + " " + a.getLastName() + "'s new annual salary is $"  + String.format("%.2f", raisedSalaryA) + ".");
		System.out.println(b.getFirstName() + " " + b.getLastName() + "'s initial annual salary was $"  + String.format("%.2f", annualSalaryB) + ".");
		System.out.println(b.getFirstName() + " " + b.getLastName() + "'s new annual salary is $"  + String.format("%.2f", raisedSalaryB) + ".");
	}
}
