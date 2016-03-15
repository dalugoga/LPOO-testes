package atm;

public class Withdrawal 
{
	private ATM atm;
	private Session s;
	private Card c;
	private int number;
	private double amount;
	
	public Withdrawal(ATM atm, Session s, Card c, int number)
	{
		this.atm = atm;
		this.s = s;
		this.c = c;
		this.number = number;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public String toString()
	{
		return "Withdrawal at ATM " + atm.getID() + " (" + 
				atm.getLocation() + ", " + atm.getBank() + 
				") of " + amount;
				
		//return String.format("Withdrawal at ATM %s (%s, %s) of %.2f", 
		//		atm.getID(), atm.getLocation(), atm.getBank(), amount);
	}
	
}
