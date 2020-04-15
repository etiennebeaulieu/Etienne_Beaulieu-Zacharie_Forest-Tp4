package structures.pile;

import java.io.Serializable;

/**
 * Classe d'implémentation d'un noeud auto-référencé d'une pile
 *
 * @see java.lang.Object
 * @author Zacharie Forest et Étienne Beaulieu
 * @version 1
 */
public class NoeudPile implements Serializable
{
	private static final long serialVersionUID = -100106444972236145L;

	/**
	 * Élément à conserver
	 */
	private Object element = null;

	/**
	 * Pointeur sur le noeud qui est en dessous
	 */
	private NoeudPile precedent = null;

	/**
	 * Constructeur
	 * 
	 * @param element, - l'élément à mettre dans le noeud
	 */
	public NoeudPile(Object element)
	{
		this(element, null);
	}

	/**
	 * Constructeur
	 * 
	 * @param element, - l'élément à mettre dans le noeud
	 * @param precedent, - un pointeur sur un NoeudPile
	 */
	public NoeudPile(Object element, NoeudPile precedent)
	{
		this.element = element;
		this.precedent = precedent;

	}

	/**
	 * Obtenir l'élément contenu dans le noeud
	 * 
	 * @return Object, l'objet dans le noeud
	 */
	public Object getElement()
	{
		return element;
	}

	/**
	 * Modifier la valeur de l'élément contenu dans le noeud
	 * 
	 * @param element, - l'élément à mettre à jour
	 */
	public void setElement(Object element)
	{
		this.element = element;
	}

	/**
	 * Obtenir une référence sur le noeud précédent.
	 * 
	 * @return NoeudPile, le pointeur sur le noeud précédent
	 */
	public NoeudPile getPrecedent()
	{
		return precedent;
	}

	/**
	 * Modifier la valeur de la référence du noeud précédent.
	 * 
	 * @param precedent, - le pointeur du nouveau précédent
	 */
	public void setPrecedent(NoeudPile precedent)
	{
		this.precedent = precedent;
	}

}
