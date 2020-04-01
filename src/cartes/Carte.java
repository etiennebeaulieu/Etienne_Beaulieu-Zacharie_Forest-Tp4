package cartes;

import java.io.Serializable;

public class Carte implements Serializable, Comparable<Carte>
{
	private static final long serialVersionUID = 8196721120250324474L;
	private SorteCartes sorte= null;
	private ValeurCartes valeur= null;
	private boolean visible = false;
	
	public static final char IMAGE_DOS = '☺';
	
	public Carte(ValeurCartes valeur, SorteCartes sorte) throws exception.ConstructeurException
	{
		this.valeur = valeur;
		this.sorte = sorte;
	}
	
	public ValeurCartes getValeur()
	{
		return valeur;
	}
	
	private void setValeur(ValeurCartes valeur)
	{
		
	}
	
	public String getValeurSymbole()
	{
		
	}
	
	public SorteCartes getSorte()
	{
		return sorte;
	}
	
	private void setSorte(SorteCartes sorte)
	{
		eg
	}
	
	public char getSorteSymbole()
	{
		
	}
	
	public boolean estVisible()
	{
		
	}
	
	public void setVisible(boolean visible)
	{
		
	}
	
	public String toStringCarte()
	{
		
	}
	
	@Override
	public boolean equals(Object obj)
	{
		
	}
	
	@Override
	public int compareTo(Carte obj)
	{
		
	}
	
	@Override
	public String toString()
	{
		
	}
	
}
