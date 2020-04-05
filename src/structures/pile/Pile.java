package structures.pile;

import java.io.Serializable;

import exception.*;

public class Pile implements Serializable
{
	/**
	 * Classe définissant une pile d'objets à partir d'un "NoeudPile" dynamique.
	 *
	 * @see java.lang.Object
	 * @author Zacharie Forest & Étienne Beaulieu
	 * @version 1
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private int taille = 0;
	
	/**
	 * 
	 */
	private NoeudPile sommet = null;

	/**
	 * 
	 */
	public Pile()
	{
		taille = 0;
		sommet = null;
	}

	/**
	 * 
	 * @param element
	 */
	public void empiler(Object element)
	{
		sommet = new NoeudPile(element, this.sommet);
		this.taille++;
	}

	/**
	 * 
	 * @return
	 * @throws exception.PileException
	 */
	public Object depiler() throws exception.PileException
	{
		Object retour = null;

		retour = getPremier();

		this.sommet = this.sommet.getPrecedent();

		return retour;
	}

	/**
	 * 
	 * @return
	 * @throws exception.PileException
	 */
	public Object getPremier() throws exception.PileException
	{
		Object retour = null;

		if (!isEmpty())
			retour = sommet.getElement();
		else
			throw new PileException("Pile vide");

		return retour;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return sommet == null;
	}

	/**
	 * 
	 */
	public void vider()
	{
		taille = 0;
		sommet = null;
	}

	/**
	 * 
	 * @return
	 */
	public int size()
	{
		return taille;
	}

	/**
	 * 
	 * @return
	 */
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
