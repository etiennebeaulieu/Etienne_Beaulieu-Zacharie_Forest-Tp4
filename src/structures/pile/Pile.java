package structures.pile;

import java.io.Serializable;

import exception.*;

/**
 * Classe définissant une pile d'objets à partir d'un "NoeudPile" dynamique.
 *
 * @see java.lang.Object
 * @author Zacharie Forest et Étienne Beaulieu
 * @version 1
 */
public class Pile implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -460427442119944675L;

	/**
	 * Conserve le nombre d'éléments dans la pile
	 */
	private int taille = 0;

	/**
	 * Pointeur pour le sommet de la pile
	 */
	private NoeudPile sommet = null;

	/**
	 * Construit une pile vide
	 */
	public Pile()
	{
		taille = 0;
		sommet = null;
	}

	/**
	 * Empile un objet dans la pile
	 * 
	 * @param element, - l'élément à empiler
	 */
	public void empiler(Object element)
	{
		sommet = new NoeudPile(element, this.sommet);
		this.taille++;
	}

	/**
	 * Retourne l'objet dépilé
	 * 
	 * @return Object, l'élément dépilé
	 * @throws exception.PileException
	 */
	public Object depiler() throws exception.PileException
	{
		Object retour = null;

		retour = getPremier();

		this.sommet = this.sommet.getPrecedent();
		taille--;

		return retour;
	}

	/**
	 * Retourne l'objet contenu dans le noeud sur le dessus de la pile sans le
	 * dépiler. Lève une exception si la pile est vide.
	 * 
	 * @return Object, l'objet sur le dessus de la pile.
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
	 * Vérifie si la pile est vide
	 * 
	 * @return boolean, vrai si elle est vide
	 */
	public boolean isEmpty()
	{
		return sommet == null;
	}

	/**
	 * Vide la pile
	 */
	public void vider()
	{
		taille = 0;
		sommet = null;
	}

	/**
	 * Retourne le nombre d'éléments dans la pile
	 * 
	 * @return int, le nombre d'éléments dans la pile
	 */
	public int size()
	{
		return taille;
	}

	/**
	 * Permet de créer une chaîne représentant les éléments qui sont dans la
	 * pile.
	 * 
	 * @return String, les éléments des la pile
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
