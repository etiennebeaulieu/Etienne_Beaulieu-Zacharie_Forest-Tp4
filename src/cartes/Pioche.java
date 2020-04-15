package cartes;

import java.io.Serializable;

import structures.pile.*;

/**
 * Classe permettant de représenter une pioche pour jouer aux cartes.
 * Essentiellement une pioche reçoit un paquet de cartes. Elle ne doit pas
 * changer ni l'ordre, ni la visibilité des cartes composant le paquet reçu.
 * Elle permet de piger une seule carte à la fois sur le dessus. N.B. Notre
 * pioche sera basée sur une pile dynamique.
 *
 * @see java.lang.Object
 * @author Zacharie Forest et Étienne Beaulieu
 * @version 1
 */
public class Pioche implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6270341352382907973L;
	/**
	 * 
	 */
	private Pile pioche = null;

	/**
	 * 
	 * @param paquet
	 */
	public Pioche(PaquetDeCartes paquet)
	{
		pioche = new Pile();
		if (paquet != null)
		{
			for (int i = paquet.size() - 1; i >= 0; i--)
			{
				pioche.empiler(paquet.consulterCarte(i));
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	public Carte piger()
	{
		Carte carte = null;
		if (!pioche.isEmpty())
		{
			carte = (Carte) pioche.depiler();
		}
		return carte;
	}

	/**
	 * 
	 * @return
	 * @throws exception.PiocheException
	 */
	public String consulterDessus() throws exception.PiocheException
	{
		String carte = null;
		if (!pioche.isEmpty())
		{
			carte = pioche.getPremier().toString();
		}
		return carte;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return pioche.isEmpty();
	}

	/**
	 * 
	 * @return
	 */
	public int size()
	{
		return pioche.size();
	}

}
