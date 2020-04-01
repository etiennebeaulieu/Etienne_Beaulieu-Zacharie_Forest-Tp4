package structures.pile;

import java.io.Serializable;

public class NoeudPile implements Serializable
{
	private static final long serialVersionUID = -100106444972236145L;
	private Object element = null;
	private NoeudPile precedent = null;

	public NoeudPile(Object element)
	{
		this(element, null);
	}

	public NoeudPile(Object element, NoeudPile precedent)
	{
		this.element = element;
		this.precedent = precedent;

	}

	public Object getElement()
	{
		return element;
	}

	public void setElement(Object element)
	{
		this.element = element;
	}

	public NoeudPile getPrecedent()
	{
		return precedent;
	}

	public void setPrecedent(NoeudPile precedent)
	{
		this.precedent = precedent;
	}

}
