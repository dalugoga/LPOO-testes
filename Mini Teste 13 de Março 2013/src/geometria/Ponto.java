package geometria;

import java.util.Comparator;

public class Ponto implements Comparator<Ponto>, Comparable<Ponto>
{
	private int x;
	private int y;
	
	public Ponto( int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(! (obj instanceof Ponto))
			return false;
		
		Ponto p = (Ponto) obj;
		
		return x == p.getX() && y == p.getY();
	}
	
	public int compareTo(Ponto p)
	{
		if(this.getX() < p.getX())
			return -1;
		else if(this.getX() > p.getX())
			return 1;
		else if(this.getY() < p.getY())
			return -1;
		else if(this.getY() > p.getY())
			return 1;
		else
			return 0;
	}
	
	public int compare(Ponto o1, Ponto o2)
	{
		if(o1.getX() < o2.getX())
			return -1;
		else if(o1.getX() > o2.getX())
			return 1;
		else if(o1.getY() < o2.getY())
			return -1;
		else if(o1.getY() > o2.getY())
			return 1;
		else
			return 0;
	}
	

	
	
}
