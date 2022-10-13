/* 
-   Project 1
-   Christopher Cao and William Byrne
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Project1
{
	public static Faculty faculty = new Faculty();
	public static Student student1 = new Student();
	public static Student student2 = new Student();

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int facultySet = 0,studentSet = 0;

		System.out.println("\t\t\tWelcome to my Personal Management Program ");
		System.out.println();
		System.out.println();
		System.out.println("Choose one of the options:");
		System.out.println();
		int opt = getOptions();

		while(opt != 5) 
		{
			if(opt == 1)
			{
				if(facultySet > 0) 
				{
					System.out.println("You already have one faculty filled in. Do you want to update his/her information? Yes or No: ");
					String ch = sc.nextLine();
					
					while(!ch.equalsIgnoreCase("Yes") && !ch.equalsIgnoreCase("No"))
					{
						System.out.println("Invalid entry- please try again");
						System.out.println("You already have one faculty filled in. Do you want to update his/her information? Yes or No: ");
						ch = sc.nextLine();
					}
			
					if(ch.equalsIgnoreCase("Yes"))
					{
						addFaculty();
					}
				}

				else 
				{
					addFaculty();
					facultySet++;
				}
			}
 
			else if(opt == 2) 
			{
				if(studentSet > 0) 
				{
					System.out.println("You already have two students filled in. Do you want to update their information? Yes or No: ");
					String ch=sc.nextLine();
    	 
					while(!ch.equalsIgnoreCase("Yes") && !ch.equalsIgnoreCase("No")) 
					{
			    		System.out.println("Invalid entry- please try again");
			    		System.out.println("You already have two students filled in. Do you want to update their information? Yes or No: ");
			    		ch = sc.nextLine();
					}

					if(ch.equalsIgnoreCase("Yes")) 
					{
						addStudents();
					}  
				}
     
				else 
				{
					addStudents();
					studentSet++;
				}
			}
			
			else if(opt == 3) 
			{
				if(studentSet > 0) 
				{
					System.out.println();
					System.out.println();
					System.out.print("Which student? 1 " + student1.getStudentName() + " or 2 " + student2.getStudentName() + " ? ");
					int ch = sc.nextInt();
			
					while(ch != 1 && ch != 2)
					{
						System.out.println("Invalid entry- please try again");
						System.out.println();
						System.out.println();
						System.out.print("Which student? 1 " + student1.getStudentName() + " or 2 " + student2.getStudentName() + " ? ");
						ch = sc.nextInt();
					}

					System.out.print("\nHere is the tuition invoice for ");
					if(ch == 1) 
					{
						System.out.println(student1.getStudentName() + ":");
						System.out.println("\n\n\n--------------------------------------------------------------------------- ");
						System.out.println(student1);
					}

					else 
					{
						System.out.println(student2.getStudentName() + ":");
						System.out.println("\n\n\n--------------------------------------------------------------------------- ");
						System.out.println(student2);
					}
					sc.nextLine();
				}
		
				else 
				{
					System.out.println("\nNo students present!!");
				}
			}

		else if(opt == 4) 
		{
			if(facultySet > 0) 
			{
				System.out.println("\n\n\n--------------------------------------------------------------------------- ");
				System.out.println("\n" + faculty);
			}
		}

			System.out.println();
			opt = getOptions();
		}

		System.out.println("\nGoodbye!");
	}

	public static int getOptions() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Enter the information of the faculty \n2. Enter the information of the two students \n3. Print tuition invoice \n4. Print faculty information \n5. Exit Program \n\n   Enter your selection: ");
		String opt = sc.nextLine();
   
		while(!opt.equals("1") && !opt.equals("2") && !opt.equals("3") && !opt.equals("4") && !opt.equals("5")) 
		{
			System.out.println("\n\n\nInvalid entry- please try again \n\n");
			System.out.print("\n1. Enter the information of the faculty \n2. Enter the information of the two students \n3. Print tuition invoice \n4. Print faculty information \n5. Exit Program \n\n  Enter your selection: ");
			opt = sc.nextLine();
		}
 
		return Integer.parseInt(opt);
	}

	public static void addFaculty() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter faculty info:\n\n \t  Name of the faculty: ");
		faculty.setFacultyName(sc.nextLine());
		System.out.print("\n\t  ID: ");
		faculty.setFacultyID(sc.nextLine());
		System.out.print("\n\t  Rank: ");
		String rank = sc.nextLine();
   
		while(!rank.equalsIgnoreCase("Professor") && !rank.equalsIgnoreCase("Adjunct"))
		{
			System.out.println("\n\t        Sorry entered rank\t(" + rank + ")\tis invalid");
			System.out.print("\n\t  Rank: ");
			rank = sc.nextLine();
		}
   
		faculty.setRank(rank);
		System.out.print("\n\t  Department: ");
		String dep = sc.nextLine();
   
		while(!dep.equalsIgnoreCase("mathematics") &&!dep.equalsIgnoreCase("engineering") && !dep.equalsIgnoreCase("arts") &&!dep.equalsIgnoreCase("science")) 
		{
			System.out.println("Sorry entered department\t(" + dep + ")\tis invalid");
			System.out.print("Department: ");
			dep = sc.nextLine();
		}
 
		faculty.setDepartment(dep);
		System.out.println("\n\n\nThanks!\n\n\n");
	}

	public static void addStudents() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\n\nEnter student 1 info:\n\n \t  Name of Student: ");
		student1.setStudentName(sc.nextLine());
		System.out.print("\n\t  ID: ");
		student1.setStudentID(sc.nextLine());
		System.out.print("\n\t  Gpa: ");
		student1.setGpa(sc.nextDouble());
		System.out.print("\n\t  Credit hours: ");
		student1.setCreditsCnt(sc.nextInt());
		System.out.println("\nThanks!");
		sc.nextLine();
		System.out.print("\n\n\nEnter student 2 info:\n\n \t  Name of Student: ");
		student2.setStudentName(sc.nextLine());
		System.out.print("\n\t  ID: ");
		student2.setStudentID(sc.nextLine());
		System.out.print("\n\t  Gpa: ");
		student2.setGpa(sc.nextDouble());
		System.out.print("\n\t  Credit hours: ");
		student2.setCreditsCnt(sc.nextInt());
		System.out.println("\nThanks!\n\n\n");
	}
}


class Student 
{
	private String studentName;
	private String studentID;
	private double gpa;
	private int creditsCnt;
	private final double CREDITS_FEE = 236.45;
	private final int ADMIN_FEE = 52;
	private final double BONUS = .25;
	public Student()
	{
		this.studentName = "";
		this.studentID = "";
		this.gpa = 0;
		this.creditsCnt = 0;
	}
 
	public Student(String name, String id, double gpa, int cCnt)
	{
		this.studentName = name;
		this.studentID = id;
		this.gpa = gpa;
		this.creditsCnt = cCnt;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public int getCreditsCnt() 
	{
		return creditsCnt;
	}

	public String getStudentID() 
	{
		return studentID;
	}

	public double getGpa() 
	{
		return gpa;
	}

	public void setStudentName(String studentName) 
	{
	  this.studentName = studentName;
	}

	public void setStudentID(String studentID) 
	{
		this.studentID = studentID;
	}

	public void setGpa(double gpa) 
	{
		this.gpa = gpa;
	}

	public void setCreditsCnt(int creditsCnt) 
	{
		this.creditsCnt = creditsCnt;
	}

	public double checkBonus()
	{
		if(gpa >= 3.85) 
		{
			return ((creditsCnt * CREDITS_FEE) + ADMIN_FEE) * BONUS;
		}
		return 0;
	}

	public double totalFee() 
	{
		if(checkBonus() == 0) 
		{
			return (creditsCnt * CREDITS_FEE) + ADMIN_FEE;
		}

		else 
		{
			return checkBonus() + ((creditsCnt * CREDITS_FEE) + ADMIN_FEE);
		}
	}

	@Override
	public String toString() 
	{
		DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
		DecimalFormat wFormat = new DecimalFormat("####,###,###");
		return "\n" + studentName + "\t\t " + studentID + " \n\nCredit Hours:" + creditsCnt + " ($"+CREDITS_FEE+"/credit hour) \n\nFees: $" + ADMIN_FEE + " \n\n\n\nTotal payment: $" + dFormat.format(totalFee())+"\t\t\t($"+wFormat.format(checkBonus()) + " discount applied)" + "\n\n---------------------------------------------------------------------------";
	}
}


class Faculty 
{
	private String facultyName;
	private String facultyID;
	private String department;
	private String rank;
	public Faculty() 
	{
		facultyName = "";
		facultyID = "";
		department = "";
		rank = "";
	}

	public Faculty(String name, String id, String dep, String r) 
	{
		facultyName = name;
		facultyID = id;
		department = dep;
		rank = r;
	}

	public String getFacultyName() 
	{
		return facultyName;
	}

	public String getFacultyID() 
	{
		return facultyID;
	}

	public String getDepartment() 
	{
		return department;
	}
 
	public String getRank() 
	{
		return rank;
	}

	public void setFacultyName(String facultyName) 
	{
		this.facultyName = facultyName;
	}

	public void setFacultyID(String facultyID) 
	{
		this.facultyID = facultyID;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}
	

	public void setRank(String rank) 
	{
		this.rank = rank;
	}
	
	@Override
	public String toString()
	{
		return facultyName + "\n\n" + department + " Department, " + rank + "\n\n---------------------------------------------------------------------------";
	}
}
