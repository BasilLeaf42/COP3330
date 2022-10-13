/* Christopher Cao and William Byrne
   Homework 7
   3/21/2020 */

public class CommissionEmployeeTest
{
	public static void main(String[] args)
	{
		CommissionEmployee employee = new CommissionEmployee("John", "Doe", "123-45-6789", 10000, 0.06);
		
		System.out.printf("Employee information obtained by get methods:%n");
		System.out.printf("%s %s%n", "First name:", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name:", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number:", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales:", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate:", employee.getCommissionRate());
		
		employee.setGrossSales(500);
		employee.setCommissionRate(0.1);
		
		System.out.printf("%n%s%n%s%n", "Updated employee information:", employee);
	}
}