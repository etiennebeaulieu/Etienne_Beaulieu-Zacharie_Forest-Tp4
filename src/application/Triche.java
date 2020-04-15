package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cartes.Carte;
import cartes.ValeurCartes;

/**
 * Classe utilitaire qui permet à un joueur de tricher lorsque la partie est
 * terminée.
 *
 * @author Étienne Beaulieu et Zacharie Forest
 */
public class Triche
{

	/**
	 * Informe l'utilisateur qu'il n'a plus de possibilités. On permet alors à
	 * l'utilisateur de tricher un peu pour se déprendre.
	 *
	 * @param parent la classe de jeu à modifier.
	 */
	public static void finiOuTriche(AcesUpSolitaire parent)
	{
		int choixColonne = 0;

		Object[] options =
		{ "Mon dieu NON !!!!!!", "monter 1", "monter 2", "monter 3", "monter 4",
				"descendre 1", "descendre 2", "descendre 3", "descendre 4" };
		choixColonne = JOptionPane.showOptionDialog(parent,
				"Désolé, la partie est terminée, il n'est plus possible "
						+ "de jouer un autre coup \n... Voulez-vous tricher ?\n"
						+ " (le jeu va descendre ou monter la carte la plus forte dans "
						+ "la colonne de votre choix)",
				"Fin de partie !", JOptionPane.WARNING_MESSAGE, 0, null,
				options, options[0]);

		if (choixColonne > 0)
		{
			// TODO Attention laisse passer les null
			parent.addTricher();
			if (choixColonne < 5)
			{
				tricheMonter(parent.getColonneCartes(choixColonne - 1));
				parent.dessinerListeCartes(choixColonne - 1);
			}
			else
			{
				tricheDescendre(parent.getColonneCartes(choixColonne - 5));
				parent.dessinerListeCartes(choixColonne - 5);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(parent,
					"On commence une nouvelle partie");
			parent.initPartie();
		}
	}

	/**
	 * Cette méthode prend la carte la plus forte de la colonne et elle la monte
	 * en haut de la colonne. En cas d'égalité (pour 2 As), la méthode considère
	 * la carte la plus haute dans la colonne. Ça permet entre autre de changer
	 * l'As de place. Il faut ici considérer l'As comme étant la carte la plus
	 * forte.
	 *
	 * @param colonneCartes la colonne à modifier.
	 *
	 */
	private static void tricheMonter(List colonneCartes)
	{
		int max = 0;
		boolean trouve = false;
		int compteur = 0;

		for (int i = 0; i < colonneCartes.size() && !trouve; i++)
		{
			if (((Carte) (colonneCartes.get(i))).getValeur().getValeur() == 1)
			{
				max = i;
				trouve = true;
			}
			else
			{
				for (int j = i + 1; j < colonneCartes.size() && !trouve; j++)
				{
					if (((Carte) (colonneCartes.get(j))).getValeur()
							.getValeur() == 1)
					{
						max = j;
						trouve = true;
					}
					else
						if (((Carte) (colonneCartes.get(max))).getValeur()
								.getValeur() < ((Carte) (colonneCartes.get(j)))
										.getValeur().getValeur())
						{
							max = j;
							compteur++;
						}
				}
				if (compteur == 0)
					trouve = true;
			}
		}

		colonneCartes.add(colonneCartes.size() - 1, colonneCartes.remove(max));

	}

	/**
	 * Cette méthode prend la carte la plus forte de la colonne et elle la
	 * descend en bas de la colonne. En cas d'égalité (pour 2 As), la méthode
	 * considère la carte la plus basse dans la colonne. Ça permet entre autre
	 * de changer l'As de place. Il faut ici considérer l'As comme étant la
	 * carte la plus forte.
	 *
	 * @param colonneCartes la colonne à modifier.
	 *
	 */
	private static void tricheDescendre(List colonneCartes)
	{
		int max = colonneCartes.size() - 1;
		boolean trouve = false;
		int compteur = 0;

		for (int i = colonneCartes.size() - 1; i >= 0 && !trouve; i--)
		{
			if (((Carte) (colonneCartes.get(i))).getValeur().getValeur() == 1)
			{
				max = i;
				trouve = true;
			}
			else
			{
				for (int j = i - 1; j >= 0 && !trouve; j--)
				{
					if (((Carte) (colonneCartes.get(j))).getValeur()
							.getValeur() == 1)
					{
						max = j;
						trouve = true;
					}
					else
						if (((Carte) (colonneCartes.get(max))).getValeur()
								.getValeur() < ((Carte) (colonneCartes.get(j)))
										.getValeur().getValeur())
						{
							max = j;
							compteur++;
						}
				}
				if (compteur == 0)
					trouve = true;
			}
		}

		colonneCartes.add(0, colonneCartes.remove(max));
	}

}
