package structures.pile;

import java.io.Serializable;

import exception.*;

public class Pile implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int taille = 0;
	private NoeudPile sommet = null;

	public Pile()
	{
		taille = 0;
		sommet = null;
	}

	public void empiler(Object element)
	{
		sommet = new NoeudPile(element, this.sommet);
		this.taille++;
	}

	public Object depiler() throws exception.PileException
	{
		Object retour = null;

		retour = getPremier();

		this.sommet = this.sommet.getPrecedent();

		return retour;
	}

	public Object getPremier() throws exception.PileException
	{
		Object retour = null;

		if (!isEmpty())
			retour = sommet.getElement();
		else
			throw new PileException("Pile vide");

		return retour;
	}

	public boolean isEmpty()
	{
		return sommet == null;
	}

	public void vider()
	{
		taille = 0;
		sommet = null;
	}

	public int size()
	{
		return taille;
	}

	@Override
	public String toString()
	{
		NoeudPile temp = this.sommet;

		String s = (isEmpty()) ? "vide!\n" : "";

		while (temp != null)
		{
			s += temp.getElement() + "\n";
			temp = temp.getPrecedent();
		}

		return s;
	}

}
