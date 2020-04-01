package cartes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import exception.ConstructeurException;

public class PaquetDeCartes implements Serializable
{
	private static final long serialVersionUID = -3742502342755309295L;
	private List<Carte> paquet = null;
	public static final int NBR_ECHANGE = 1000;

	public PaquetDeCartes()
	{
		paquet = new ArrayList<Carte>();

		for (SorteCartes sorte : SorteCartes.values())
		{
			for (ValeurCartes valeur : ValeurCartes.values())
			{
				paquet.add(new Carte(valeur, sorte));
			}
		}
	}

	public PaquetDeCartes(List<Carte> paquet)
			throws exception.ConstructeurException
	{
		if (paquet != null)
		{
			this.paquet = paquet;
		}
		else
			throw new ConstructeurException(
					"Un paquet de cartes ne peut-être null");
	}

	public void brasser()
	{
		int ind1;
		int ind2;
		for (int i = 0; i < NBR_ECHANGE; i++)
		{
			ind1 = (int) (Math.random() * paquet.size());
			ind2 = (int) (Math.random() * paquet.size());
			permuterCarte(ind1, ind2);
		}
	}

	private void permuterCarte(int index1, int index2)
	{
		Carte temp = paquet.set(index1, paquet.get(index2));
		paquet.set(index2, temp);
	}

	public Carte consulterCarte(int position)
	{
		Carte carte = null;

		if (paquet != null && validerPosition(position))
		{
			carte = paquet.get(position);
		}

		return carte;

	}

	public Carte prendreCarte(int position)
	{
		Carte carte = null;

		if (paquet != null && validerPosition(position))
		{
			carte = paquet.remove(position);
		}

		return carte;
	}

	public void retournerToutesLesCartes(boolean visible)
	{
		for (int i = 0; i < this.size(); i++)
		{
			paquet.get(i).setVisible(visible);
		}
	}

	public int size()
	{
		return paquet.size();
	}

	public boolean isEmpty()
	{
		return paquet.size() == 0;
	}

	private boolean validerPosition(int position)
	{
		return (position > 0 && position < this.size());
	}

}
