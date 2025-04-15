package ABABank;

public class ABA 
{

	public static void main(String[] args) 
	{
		
		
		//Create a customer class
		Customer cust1 = new Customer("Joey", "Ali", "190 Heat Road");
		
		//Create a bank object
		Bank myBank = new Bank("ABA", 0.0, cust1);
		
		System.out.println(myBank.getbankName());
		System.out.println(myBank.getAccountBalance());
		myBank.setaccountBalance(109.00);
		System.out.println(myBank.toString());
		
		
		/*cust1.setaddress("32 Crest Avenue");
		System.out.println(cust1.toString());
		*/
		
		
		
		

	}

}
