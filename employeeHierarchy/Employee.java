/* Christopher Cao and William Byrne
   Homework 7
   3/21/2020 */

public class Employee
{
	String firstName;
	String lastName;
	String socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	public final void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public final void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public final void setSocialSecurityNumber(String SocialSecurityNumber)
	{
		this.socialSecurityNumber = SocialSecurityNumber;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: %s%n%s: %s%n", "First name", getFirstName(), "Last name", getLastName(), "Social security number", getSocialSecurityNumber());
	}
}