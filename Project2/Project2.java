/*
 -  Project 2
 -  Christopher Cao and William Byrne
 */


import java.util.*;
import java.util.Formatter;
import java.util.Scanner;

abstract class Project2
{
	String fullname;
	String id;

public Project2(){}
	
	public Project2(String s,String ID)
	{
		fullname = s;
		id = ID;
	}
	
    public void setName(String s)
	{
		fullname = s;
	}

	public void setId(String ID)
	{
		id = ID;
	}

   public String getName()
	{
		return fullname;
	}

	public String getId()
	{
		return id;
	}

	@Override
	public boolean equals(Object b)
	{
		return (((Project2)b).id).equals(this.id);
	}

	
	public abstract void printInvoice();
}

class Faculty extends Project2
{
	String Department;

	String Rank;

	public Faculty(String n,String i,String d,String R)
	{
		fullname = n;
		id = i;
		Department = d;
		Rank = R;
	}

	public Faculty(String i)
	{
		id = i;
	}

	public Faculty()
	{

		System.out.println("\nEnter the faculty's info:");
		Scanner s = new Scanner(System.in);
		String temp;
		System.out.print("\n\t\tName of the faculty: ");
		fullname = s.nextLine();
		System.out.print("\n\t\tID: ");
		id = s.nextLine().toLowerCase();

		boolean valid = true;
		do
		{
			valid = true;
			System.out.print("\n\t\tRank: ");
			temp = s.nextLine().toLowerCase();

			if(!temp.equals("professor") && !temp.equals("adjunct"))
			{
				valid = false;
				System.out.println("\n\t\t\tSorry entered rank ("+temp+") is invalid");
			}
		}
		
		while(!valid);
			Rank = temp.substring(0,1).toUpperCase() + temp.substring(1);

		do
		{
			valid = true;
			System.out.print("\n\t\tDepartment: ");
			temp = s.nextLine().toLowerCase();
			if(!temp.equals("mathematics") && !temp.equals("engineering") && !temp.equals("arts") && !temp.equals("science"))
			{
				valid = false;
				System.out.println("Sorry entered department ("+temp+") is invalid");
			}
		}
		
		while(!valid);
			Department = temp.substring(0,1).toUpperCase() + temp.substring(1);

		System.out.println("Thanks!");
}

public void setDept(String dept)
{
	Department = dept;
}

public void setRank(String r)
{
	Rank = r;
}

public String getDept()
{
	return Department;
}

public String getRank()
{
	return Rank;
}

public String toString()
{
	return "\n\t---------------------------------------------------------------\n\n\t"+fullname+"\n\n\t"+Department+" Department, "+Rank+"\n\n\t---------------------------------------------------------------\n";
}

@Override
public void printInvoice()
{}
} //ends class faculty

class Student extends Project2
{
	double gpa;
	int creditHours;

	public Student(String i)
	{
		id = i;
	}
	
	public Student()
	{
		System.out.println("\nEnter the student's info:");
		Scanner s = new Scanner(System.in);
		String temp;

		System.out.print("\n\t\tName of the Student: ");
		fullname = s.nextLine();

		System.out.print("\n\t\tID: ");
		id = s.nextLine().toLowerCase();

		System.out.print("\n\t\tGpa: ");
		gpa = s.nextDouble();s.nextLine();

		System.out.print("\n\t\tCredit hours: ");
		creditHours = s.nextInt();s.nextLine();

		System.out.println("\nThanks!\n");
	}

	public void setGpa(double g)
	{
		gpa = g;
	}

	public void setCreditHours(int c)
	{
		creditHours=c;
	}

	public double getGpa()
	{
		return gpa;
	}

	public int getCreditHours()
	{
		return creditHours;
	}

	@Override
	public void printInvoice()
	{

		System.out.println("\n\tHere is the tuition invoice for "+fullname+" :\n");
		System.out.println("\n\t---------------------------------------------------------------\n");
		System.out.println("\t"+fullname+"\t\t\t "+id);
		System.out.println("\n\t"+"Credit Hours:"+creditHours+" ($236.45/credit hour)");

		double payment = 52 + (236.45) * creditHours;
		double discount = 0;

		if(gpa >= 3.85)
			discount = 0.25;

		System.out.println("\n\tFees: $52\n");
		Formatter f = new Formatter();
		f.format("%,6.2f",(payment*(1-discount)));

		System.out.println("\n\tTotal payment: $"+f+" \t\t($"+(payment*discount)+" discount applied)\n");
		System.out.println("\t---------------------------------------------------------------");

		payment *= (1-discount);
	}

	@Override
	public boolean equals(Object b)
	{
		return (((Student)b).id == this.id);
	}
}

class Tester
{
	public static void main(String[] args)
	{
		ArrayList<Project2> array = new ArrayList<Project2>();
		System.out.println(" \t\t\t\tWelcome to my Personal Management Program");

		boolean done = false;
		Scanner s = new Scanner(System.in);
		boolean valid = true;

		while(!done)
		{
			System.out.println();

			if(valid)
				System.out.println("Choose one of the options:");

			valid = true;

			System.out.println("\n1- Add a new Faculty member");
			System.out.println("2- Add a new Student");
			System.out.println("3- Print tuition invoice of a student");
			System.out.println("4- Print information of a faculty");
			System.out.println("5- Exit Program");
			System.out.print("\n\tEnter your selection: ");

			String choice = s.nextLine();

			if(choice.equals("1"))
				array.add(new Faculty());

			else if(choice.equals("2"))
				array.add(new Student());

			else if(choice.equals("3"))
			{
				System.out.print("\n\n\tEnter the student's id: ");
				String temp = s.nextLine().toLowerCase();
				boolean found=false;

				for(Project2 p : array)
					
				if(p.getId().equals(temp) && p instanceof Student)
				{
					p.printInvoice();
					found = true;
					break;
				}

				if(!found)
					System.out.println("\nSorry-student not found!");
			}

			else if(choice.equals("4"))
			{
				System.out.print("\n\tEnter the faculty's id: ");
				String temp = s.nextLine().toLowerCase();
				boolean found = false;

				for(Project2 p : array)

				if(p.getId().equals(temp) && p instanceof Faculty)
				{
					System.out.println("\nFaculty found:");
					System.out.println(p);
					found=true;
					break;
				}

				if(!found)
					System.out.println("\n\tSorry "+temp+" doesn't exist");
			}

			else if(choice.equals("5"))
				done = true;

			else
			{
				System.out.println("\nInvalid entry- please try again");
				valid = false;
			}
		}
		
		System.out.println("\n\tGoodbye!");
	}
}
