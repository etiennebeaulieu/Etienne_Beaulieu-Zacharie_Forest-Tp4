package cartes;

import java.io.Serializable;

public class Carte implements Serializable, Comparable<Carte>
{
	private static final long serialVersionUID = 8196721120250324474L;
	private SorteCartes sorte = null;
	private ValeurCartes valeur = null;
	private boolean visible = false;

	public static final char IMAGE_DOS = '☺';

	public Carte(ValeurCartes valeur, SorteCartes sorte)
			throws exception.ConstructeurException
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
		this.valeur = valeur;
	}

	public String getValeurSymbole()
	{
		return valeur.getSymbole();
	}

	public SorteCartes getSorte()
	{
		return sorte;
	}

	private void setSorte(SorteCartes sorte)
	{
		this.sorte = sorte;
	}

	public char getSorteSymbole()
	{
		return sorte.getSymbole();
	}

	public boolean estVisible()
	{
		return visible;
	}

	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}

	public String toStringCarte()
	{
		String chaine = "" + IMAGE_DOS;
		if (visible)
		{
			chaine = valeur.getSymbole() + sorte.getSymbole();
		}
		return chaine;
	}

	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof Carte
				&& this.getValeur().getValeur() == (((Carte) obj).getValeur().getValeur())
				&& this.getSorte().getSymbole() == (((Carte) obj).getSorte().getSymbole()));
	}

	@Override
	public int compareTo(Carte obj)
	{
		return (this.valeur.toString() + this.sorte.toString())
				.compareToIgnoreCase(obj.valeur.toString() + obj.sorte.toString());
	}

	@Override
	public String toString()
	{
		return (this.valeur.toString() + " " + this.sorte.toString() + " " + visible);
	}

}
