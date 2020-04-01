package structures.pile;

import java.io.Serializable;

public class NoeudPile implements Serializable
{
	private static final long serialVersionUID = -100106444972236145L;
	private Object element = null;
	private NoeudPile precedent = null;
	
	public NoeudPile(Object pElement)
	{
		this(pElement, null);
	}
	
	public NoeudPile(Object pElement, NoeudPile pPrecedent)
	{
		element = pElement;
		precedent = pPrecedent;
		
	}
	
	public Object getElement()
	{
		return element;
	}
	
	public void setElement(Object pElement)
	{
		element = pElement;
	}
	
	public NoeudPile getPrecedent()
	{
		return precedent;
	}
	
	public void setPrecedent(NoeudPile pPrecedent)
	{
		precedent = pPrecedent;
	}
	
}
