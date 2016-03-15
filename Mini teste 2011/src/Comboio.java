import java.util.ArrayList;

public class Comboio 
{
	protected String nome;
	protected int numLugares;
	protected int numCarruagens;
	ArrayList<Carruagem> carruagens = new ArrayList<Carruagem>();
	protected int numPassageiros;
	protected ServicoABordo servico = new ServicoRegular();
	
	
	public Comboio(String nome)
	{
		this.nome = nome;
		numLugares = 0;
		numCarruagens = 0;
		numPassageiros = 0;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void addCarruagem(Carruagem c)
	{
		carruagens.add(c);
		numCarruagens++;
		numLugares = numLugares + c.getNumLugares();
	}
	
	public int getNumCarruagens()
	{
		return numCarruagens;
	}
	
	public int getNumLugares()
	{
		return numLugares;
	}

	public Carruagem getCarruagemByOrder(int i)
	{
		return carruagens.get(i);
	}
	
	public void removeAllCarruagens(int c)
	{
		for(int i = 0; i < carruagens.size(); i++)
		{
			if(carruagens.get(i).getNumLugares() == c)
			{
				numCarruagens --;
				numLugares = numLugares - c;
				carruagens.remove(i);
			}
		}
	}
	
	public int getNumPassageiros()
	{
		return numPassageiros;
	}
	
	public int getLugaresLivres()
	{
		return numLugares - numPassageiros;
	}
	
	public void addPassageiros(int num) throws PassengerCapacityExceeded
	{
		if(num > getLugaresLivres())
			throw new PassengerCapacityExceeded();
		else
			numPassageiros = numPassageiros + num;
	}
	
	public void removePassageiros(int num)
	{
		numPassageiros = numPassageiros - num;
		if(numPassageiros < 0)
		{
			numPassageiros = 0;
		}
	}
	
	public void removePassageiros()
	{
		numPassageiros = 0;
	}
	
	public String toString()
	{
		return "Comboio " + nome + ", " + numCarruagens + " carruagens, "
				+ numLugares + " lugares, " + numPassageiros + " passageiros";
	}
	
	public ArrayList<Carruagem> getCarruagens()
	{
		return carruagens;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Comboio c = (Comboio) obj;
		if(carruagens.size() != c.getCarruagens().size())
			return false;
		
		for(int i = 0; i < carruagens.size(); i++)
		{
			if(carruagens.get(i).getNumLugares() != c.getCarruagens().get(i).getNumLugares())
			{
				return false;
			}
		}
		
		return true;
	}
	
	public ServicoABordo getServicoABordo()
	{
		return servico;
	}
	
	public String getDescricaoServico()
	{
		return servico.getServicoABordo();
	}
	
}
