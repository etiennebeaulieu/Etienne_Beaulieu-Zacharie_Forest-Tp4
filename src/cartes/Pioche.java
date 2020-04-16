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
	private static final long serialVersionUID = -6270341352382907973L;

	/**
	 * la pile qui va représenter notre pioche
	 */
	private Pile pioche = null;

	/**
	 * Constructeur. Met les cartes du paquet dans la pioche. Faire attention de
	 * conserver l'ordre et la visibilité des cartes du paquet reçu en entrée,
	 * en les mettant dans la pioche. Il ne faut pas inverser l'ordre des
	 * cartes.
	 * 
	 * @param paquet, - le paquet de cartes à mettre dans la pioche. Peut être
	 *            un pointeur "null", qui donne une pioche vide.
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
	 * Permet de piger une carte sur le dessus du paquet. Ne modifie pas la
	 * visibilité de la carte pigée
	 * 
	 * @return Carte, la carte pigée ou null si le paquet est vide.
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
	 * Permet de voir la carte du dessus sans la piger. Ne modifie pas la
	 * visibilité de la carte. Utilise la méthode "toStringCarte()"
	 * 
	 * @return String, une chaîne qui représente la carte du dessus si la pioche
	 *         n'est pas vide.
	 * @throws exception.PiocheException Lance une exception si la pioche est vide
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
	 * Permet de savoir si la pioche est vide
	 * @return boolean, vrai si la pioche est vide.
	 */
	public boolean isEmpty()
	{
		return pioche.isEmpty();
	}

	/**
	 * Retourne la taille de la pioche
	 * @return int, la taille.
	 */
	public int size()
	{
		return pioche.size();
	}

}
