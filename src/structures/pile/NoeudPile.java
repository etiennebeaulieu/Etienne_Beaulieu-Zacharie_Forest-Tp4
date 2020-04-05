package structures.pile;

import java.io.Serializable;

/**
 * Classe d'implémentation d'un noeud auto-référencé d'une pile
 *
 * @see java.lang.Object
 * @author Zacharie Forest & Étienne Beaulieu
 * @version 1
 */
public class NoeudPile implements Serializable
{
	private static final long serialVersionUID = -100106444972236145L;
	
	/**
	 * 
	 */
	private Object element = null;
	
	/**
	 * 
	 */
	private NoeudPile precedent = null;

	/**
	 * 
	 * @param element
	 */
	public NoeudPile(Object element)
	{
		this(element, null);
	}

	/**
	 * 
	 * @param element
	 * @param precedent
	 */
	public NoeudPile(Object element, NoeudPile precedent)
	{
		this.element = element;
		this.precedent = precedent;

	}

	/**
	 * 
	 * @return
	 */
	public Object getElement()
	{
		return element;
	}

	/**
	 * 
	 * @param element
	 */
	public void setElement(Object element)
	{
		this.element = element;
	}

	/**
	 * 
	 * @return
	 */
	public NoeudPile getPrecedent()
	{
		return precedent;
	}

	/**
	 * 
	 * @param precedent
	 */
	public void setPrecedent(NoeudPile precedent)
	{
		this.precedent = precedent;
	}

}
