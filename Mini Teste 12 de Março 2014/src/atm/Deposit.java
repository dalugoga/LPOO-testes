package atm;

public class Deposit 
{
	private ATM atm;
	private Session s;
	private Card c;
	private int number;
	private int amount;
	
	public Deposit(ATM atm, Session s, Card c, int number)
	{
		this.atm = atm;
		this.s = s;
		this.c = c;
		this.number = number;
	}
}
