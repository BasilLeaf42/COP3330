/* Christopher Cao and William Byrne
   Homework 7
   3/21/2020 */

public class BasePlusCommissionEmployee
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;

	public BasePlusCommissionEmployee( String fname, String lname, String ssn, double sales, double rate, double salary )
	{
		firstName = fname;
		lastName = lname;
		socialSecurityNumber = ssn;
		setGrossSales(sales);
		setCommissionRate(rate);
		setBaseSalary(salary);
	}

	public void setFirstName(String fname)
	{
		firstName = fname;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String lname)
	{
		lastName = lname;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setSocialSecurityNumber(String ssn)
	{
		socialSecurityNumber = ssn;
	}

	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}

	public void setGrossSales(double sales)
	{
		grossSales = (sales < 0.0) ? 0.0 : sales;
	}

	public double getGrossSales()
	{
		return grossSales;
	}

	public void setCommissionRate(double rate)
	{
		commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
	}

	public double getCommissionRate()
	{
		return commissionRate;
	}

	public void setBaseSalary(double salary)
	{
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}

	public double getBaseSalary()
	{
		return baseSalary;
	}

	public double earnings()
	{
		return baseSalary + (commissionRate * grossSales);
	}

	public String toString()
	{
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", "Base-salaried commission employee", firstName, lastName, "Social security number", socialSecurityNumber, "Gross sales", grossSales, "Commission rate", commissionRate, "Base salary", baseSalary);
	}
}
