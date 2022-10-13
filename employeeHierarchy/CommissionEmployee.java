/* Christopher Cao and William Byrne
   Homework 7
   3/21/2020 */

public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String fname, String lname, String ssn, double sales, double rate)
	{
		super(fname, lname, ssn);
		setGrossSales(sales);
		setCommissionRate(rate);
	}

	public final double getGrossSales()
	{
		return grossSales;
	}

	public final double getCommissionRate()
	{
		return commissionRate;
	}

	public void setGrossSales(double sales)
	{
		if(sales < 0)
		{
			throw new IllegalArgumentException("Gross sales cannot be less than 0.");
		}
		
		else
		{
			grossSales = sales;
		}
	}
	
	public void setCommissionRate(double rate)
	{
		if(rate <= 0.0 || rate >= 1.0)
		{
			throw new IllegalArgumentException("Commission rate must be greater than 0 and less than 1.");
		}
		
		else
		{
			commissionRate = rate;
		}
	}

	public double earnings()
	{
		return commissionRate * grossSales;
	}

	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %s%n", "Commission employee", firstName, lastName, "Social security number", socialSecurityNumber, "Gross sales", grossSales, "Commission rate", commissionRate);
	}
}
