package geometria;

public class FiguraComposta extends Figura implements Countable
{
	private Figura[] figuras;
	
	public FiguraComposta(Figura[] figuras)
	{
		this.figuras = figuras;
	}
	
	public double getArea()
	{
		double area = 0;
		
		for(int i = 0; i < figuras.length; i++)
		{
			area = area + figuras[i].getArea();
		}
		
		return area;
	}
	
	public int count()
	{
		return figuras.length;
	}
}
