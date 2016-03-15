package atm;

public class ATM 
{
	private int iD;
	private String location;
	private String bank;
	
	public ATM(int iD, String location, String bank)
	{
		this.iD = iD;
		this.location = location;
		this.bank = bank;
	}

	
	public int getID()
	{
		return iD;		
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public String getBank()
	{
		return bank;
	}
	
	public boolean equals(ATM atm)
	{
		if(iD == atm.getID() && location == atm.getLocation() && bank == atm.getBank())
			return true;
		else
			return false;
	}	
	
}
