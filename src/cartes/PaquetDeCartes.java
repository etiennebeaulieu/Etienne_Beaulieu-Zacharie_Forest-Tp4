package cartes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import exception.ConstructeurException;

/**
 * Classe permettant de représenter un paquet de cartes à jouer. Peut créer un
 * paquet de cartes complet ou prendre un vecteur de carte comme paquet. Offre
 * des services pour brasser le paquet, piger une carte dans le paquet, regarder
 * une carte du paquet, retourner toutes les cartes du paquet. N.B. Notre paquet
 * sera basé sur une liste dynamique.
 *
 * @see java.lang.Object
 * @author Zacharie Forest et Étienne Beaulieu
 * @version 1
 */
public class PaquetDeCartes implements Serializable
{
	private static final long serialVersionUID = -3742502342755309295L;

	/**
	 * Le paquet de cartes, une structure qui hérite de l'interface java "List"
	 */
	private List<Carte> paquet = null;

	/**
	 * Nombre d'échanges pour brasser un paquet de carte
	 */
	public static final int NBR_ECHANGE = 1000;

	/**
	 * Constructeur permettant de créer un paquet complet de cartes de 4 sortes
	 * X 13 cartes.
	 */
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

	/**
	 * Constructeur avec paramètre permettant de faire des tests.
	 * 
	 * @param paquet - un paquet de cartes. Ne peut-être "null"
	 * @throws exception.ConstructeurException Lance une exception si la liste est null
	 */
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

	/**
	 * Brasse le paquet de cartes en provoquant un certain nombre d'échanges
	 * entre les cartes du paquet. Plus le nombre d'échanges est grand, mieux le
	 * paquet sera brassé. Utilise permuterCarte.
	 */
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

	/**
	 * Permet de permuter 2 cartes dans le paquet selon leur position
	 * 
	 * @param index1 - index d'une carte
	 * @param index2 - index d'une autre carte
	 */
	private void permuterCarte(int index1, int index2)
	{
		Carte temp = paquet.set(index1, paquet.get(index2));
		paquet.set(index2, temp);
	}

	/**
	 * Consulte, sans la retirer, une carte du paquet selon la position voulue.
	 * Ne modifie pas la visibilité de la carte consultée.
	 * 
	 * @param position - la position voulue entre 1 et le nombre de cartes dans
	 *            le paquet.
	 * @return Carte, la carte choisie ou "null" si le paquet est vide ou si la
	 *         position est invalide.
	 */
	public Carte consulterCarte(int position)
	{
		Carte carte = null;

		if (validerPosition(position))
		{
			carte = paquet.get(position);
		}

		return carte;

	}

	/**
	 * Retire une carte du paquet selon la position voulue. Ne modifie pas la
	 * visibilité de la carte retirée.
	 * 
	 * @param position - , la position voulue entre 1 et le nombre de cartes
	 *            dans le paquet.
	 * @return Carte, la carte enlevée ou "null" si le paquet est vide ou si la
	 *         position est invalide.
	 */
	public Carte prendreCarte(int position)
	{
		Carte carte = null;

		if (validerPosition(position))
		{
			carte = paquet.remove(position);
		}

		return carte;
	}

	/**
	 * Rend toutes les cartes du paquet visibles ou invisibles (face cachée).
	 * 
	 * @param visible, - vrai pour visible et faux pour face cachée
	 */
	public void retournerToutesLesCartes(boolean visible)
	{
		for (int i = 0; i < this.size(); i++)
		{
			paquet.get(i).setVisible(visible);
		}
	}

	/**
	 * Permet de savoir le nombre de cartes dans le paquet.
	 * 
	 * @return int, le nombre de cartes.
	 */
	public int size()
	{
		return paquet.size();
	}

	/**
	 * Permet de savoir si le paquet de cartes est vide
	 * 
	 * @return boolean, vrai si le paquet est vide
	 */
	public boolean isEmpty()
	{
		return paquet.size() == 0;
	}

	/**
	 * Valide si l'entier reçu en entrée est valide selon le nombre de cartes
	 * dans le paquet. Attention on parle ici de la position et non de l'index.
	 * 
	 * @param position - , une position dans le paquet entre 1 et la taille du
	 *            paquet
	 * @return boolean, vrai si l'entier est valide selon le nombre de cartes
	 *         dans le paquet
	 */
	private boolean validerPosition(int position)
	{
		return (position >= 0 && position < this.size());
	}

}
