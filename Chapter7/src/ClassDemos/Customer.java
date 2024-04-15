package ClassDemos;

public class Customer 
{
	private String firstName;
	private String lastName;
	private int age;
	
	//Constructor Method
	public Customer(String fn, String ln, int a)
	{
		firstName = fn;
		lastName = ln;
		age = a;
	}
	
	//Accessor Methods
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public int getAge()
	{
		return age;
	}
	//Modifier Methods
	public void setfirstName(String fn)
	{
		firstName = fn;
	}
	public void setlastName(String ln)
	{
		lastName = ln;
	}
	public void setAge(int a)
	{
		age = a;
	}
	
	public  String toString()
	{
		return("First Name: " + firstName 
				+"\nLast Name : " + lastName
				+ "\nAge: "+ age
				);
	}
	
	

}
