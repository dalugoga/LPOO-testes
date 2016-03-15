
public class TGV extends Comboio
{
	public TGV(String nome)
	{
		super(nome);
	}
	
	public String toString()
	{
		return "TGV " + nome + ", " + numCarruagens + " carruagens, "
				+ numLugares + " lugares, " + numPassageiros + " passageiros";
	}
	
}
