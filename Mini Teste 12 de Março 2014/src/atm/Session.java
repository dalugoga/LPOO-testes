package atm;

import java.util.ArrayList;

public class Session implements Countable
{
	private ATM atm;
	private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
	private ArrayList<Withdrawal> withdrawals = new ArrayList<Withdrawal>();

	public Session(ATM atm)
	{
		this.atm = atm;
		
	}
	
	public ATM getATM()
	{
		return atm;
	}
	
	public void addTransaction(Withdrawal w)
	{
		withdrawals.add(w);
	}
	
	public void addTransaction(Deposit d)
	{
		deposits.add(d);
	}
	
	public int count()
	{
		return withdrawals.size() + deposits.size();
	}

	@Override
	public boolean equals(Object o){
		if(! (o instanceof Session))return false;
		
		Session u  = (Session)o;
		
		return this.atm.getID()== u.atm.getID() 
				&& this.atm.getLocation().equals(u.atm.getLocation())
				&& this.atm.getBank().equals(u.atm.getBank());
	}

	
	
}
