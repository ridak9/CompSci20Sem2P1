package ABABank;

public class Bank 
{
	private String bankName;
	private double accountBalance;
	private Customer aCustomer;
	
	public Bank(String bankN, double bal, Customer c)
	{
		bankName = bankN;
		accountBalance = bal;
		aCustomer = c;
	}
	public String getbankName()
	{
		return bankName;
	}
	public double getAccountBalance()
	{
		return accountBalance;
	}
	public void setaccountBalance(double n)
	{
		accountBalance = n;
	}
	
	public void deposit(double amt)
	{
		if(amt > 0)
		{
			accountBalance = accountBalance + amt;
			System.out.println("Deposit successful!");
			System.out.println("Updated balance is" 
			+ accountBalance);
		}
		else
		{
			System.out.println("Deposit amount must be positive.");
		}
	}
	
	
	
	
	public String toString()
	{
		String bank;
		
		bank = "Bank name is: " 
				+ bankName + " and account balance is $: "
				+ accountBalance +"\n"
				+ aCustomer;

		
		return bank;
	}
}
