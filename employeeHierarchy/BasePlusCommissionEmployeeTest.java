/* Christopher Cao and William Byrne
   Homework 7
   3/21/2020 */

public class BasePlusCommissionEmployeeTest
{
	public static void main(String[] args)
	{
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Jane", "Roe", "987-65-4321", 5000, 0.04, 300);
		
		System.out.printf("Employee information obtained by get methods:%n");
		System.out.printf("%s %s%n", "First name:", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name:", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number:", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales:", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate:", employee.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary:", employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		
		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString()", employee.toString());
	}
}
