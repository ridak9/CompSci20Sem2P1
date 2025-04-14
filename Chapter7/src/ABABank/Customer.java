package ABABank;

public class Customer 
{
	//Attributes or fields
	private String firstName;
	private String lastName;
	private String address;

	
	//Constructor method
	
	public Customer()
	{
		firstName = "";
		lastName = " ";
		address = " ";
	}
	
	public Customer(String fn, String ln, String add)
	{
		firstName = fn;
		lastName = ln;
		address = add;
	}
	
	//Accessor methods
	
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public String getaddress()
	{
		return address;
	}
	
	
	//Modifier methods
	
	public void setfirstName(String n)
	{
		firstName = n;
	}
	public void setlastName(String l)
	{
		lastName = l;
	}
	public void setaddress(String ad)
	{
		address = ad;
	}
	
	
	public String toString()
	{
		String customer;
		
		customer = "Customer full name: " 
				+ firstName + " "+ lastName
				+ " customer's address: "
				+ address;
		
		return customer;
	}
	
}
