package geometria;

public class Rectangulo extends Figura
{
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	public Rectangulo(int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public double getPerimetro()
	{
		return Math.abs(x2 -x1)*2 + Math.abs(y2-y1)*2;
	}
	
	public double getArea()
	{
		return Math.abs(x2-x1)*Math.abs(y2-y1);
	}
}


