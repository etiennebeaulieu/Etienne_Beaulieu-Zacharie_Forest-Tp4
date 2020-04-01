package cartes;
import structures.pile.*;

public class Pioche
{
	private Pile pioche= null;
	
	public Pioche(PaquetDeCartes paquet)
	{
		pioche = new Pile();
		for(int i = paquet.size(); i> 0; i--)
		{
			pioche.empiler(paquet.consulterCarte(i));
		}
	}
	
	public Carte piger()
	{
		Carte carte = null;
		if(!pioche.isEmpty())
		{
			carte = (Carte)pioche.depiler();
		}
		return carte;
	}
	
	public String consulterDessus() throws exception.PiocheException
	{
		String carte = null;
		if(!pioche.isEmpty())
		{
			carte = pioche.getPremier().toString();
		}
		return carte;
	}
	
	public boolean isEmpty()
	{
		return pioche.isEmpty();
	}
	
	public int size()
	{
		return pioche.size();
	}
	
}
