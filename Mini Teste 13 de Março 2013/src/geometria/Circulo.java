package geometria;

public class Circulo extends Figura
{
	private Ponto p;
	private int raio;
	
	public Circulo(Ponto p, int raio) throws Exception
	{
		this.p = p;
		this.raio = raio;
		if(raio <= 0)
			throw new  IllegalArgumentException();
			
	}
	
	public Ponto getCentro()
	{
		return p;
	}
	public int getRaio()
	{
		return raio;
	}
	
	public double getArea()
	{
		return Math.PI * raio * raio;
	}
}
