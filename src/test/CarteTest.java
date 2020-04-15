package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cartes.Carte;
import cartes.SorteCartes;
import cartes.ValeurCartes;
import exception.ConstructeurException;

public class CarteTest
{
	Carte c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13;

	@Before
	public void testCarte()
	{
		c1 = new Carte(ValeurCartes.V_AS, SorteCartes.COEUR);
		c2 = new Carte(ValeurCartes.V_2, SorteCartes.COEUR);
		c3 = new Carte(ValeurCartes.V_3, SorteCartes.COEUR);
		c4 = new Carte(ValeurCartes.V_4, SorteCartes.CARREAU);
		c5 = new Carte(ValeurCartes.V_5, SorteCartes.CARREAU);
		c6 = new Carte(ValeurCartes.V_6, SorteCartes.CARREAU);
		c7 = new Carte(ValeurCartes.V_7, SorteCartes.PIQUE);
		c8 = new Carte(ValeurCartes.V_8, SorteCartes.PIQUE);
		c9 = new Carte(ValeurCartes.V_9, SorteCartes.PIQUE);
		c10 = new Carte(ValeurCartes.V_10, SorteCartes.TREFLE);
		c11 = new Carte(ValeurCartes.V_JACK, SorteCartes.TREFLE);
		c12 = new Carte(ValeurCartes.V_QUEEN, SorteCartes.TREFLE);
		c13 = new Carte(ValeurCartes.V_KING, SorteCartes.TREFLE);
	}

	@Test
	public void testCarteInvalide()
	{
		try
		{
			new Carte(null, SorteCartes.COEUR);
			fail("Constructeur invalide");
		}
		catch (ConstructeurException e)
		{
		}

		try
		{
			new Carte(ValeurCartes.V_10, null);
			fail("Constructeur invalide");
		}
		catch (ConstructeurException e)
		{
		}

		try
		{
			new Carte(null, null);
			fail("Constructeur invalide");
		}
		catch (ConstructeurException e)
		{
		}
	}

	@Test
	public void testGetValeur()
	{
		assertEquals(c1.getValeur(), ValeurCartes.V_AS);
		assertEquals(c2.getValeur(), ValeurCartes.V_2);
		assertEquals(c3.getValeur(), ValeurCartes.V_3);
		assertEquals(c4.getValeur(), ValeurCartes.V_4);
		assertEquals(c5.getValeur(), ValeurCartes.V_5);
		assertEquals(c6.getValeur(), ValeurCartes.V_6);
		assertEquals(c7.getValeur(), ValeurCartes.V_7);
		assertEquals(c8.getValeur(), ValeurCartes.V_8);
		assertEquals(c9.getValeur(), ValeurCartes.V_9);
		assertEquals(c10.getValeur(), ValeurCartes.V_10);
		assertEquals(c11.getValeur(), ValeurCartes.V_JACK);
		assertEquals(c12.getValeur(), ValeurCartes.V_QUEEN);
		assertEquals(c13.getValeur(), ValeurCartes.V_KING);
	}

	@Test
	public void testGetValeurSymbole()
	{
		assertEquals(c1.getValeurSymbole(), "A");
		assertEquals(c2.getValeurSymbole(), "2");
		assertEquals(c3.getValeurSymbole(), "3");
		assertEquals(c4.getValeurSymbole(), "4");
		assertEquals(c5.getValeurSymbole(), "5");
		assertEquals(c6.getValeurSymbole(), "6");
		assertEquals(c7.getValeurSymbole(), "7");
		assertEquals(c8.getValeurSymbole(), "8");
		assertEquals(c9.getValeurSymbole(), "9");
		assertEquals(c10.getValeurSymbole(), "10");
		assertEquals(c11.getValeurSymbole(), "J");
		assertEquals(c12.getValeurSymbole(), "Q");
		assertEquals(c13.getValeurSymbole(), "K");
	}

	@Test
	public void testGetSorte()
	{
		assertEquals(c1.getSorte(), SorteCartes.COEUR);
		assertEquals(c2.getSorte(), SorteCartes.COEUR);
		assertEquals(c3.getSorte(), SorteCartes.COEUR);
		assertEquals(c4.getSorte(), SorteCartes.CARREAU);
		assertEquals(c5.getSorte(), SorteCartes.CARREAU);
		assertEquals(c6.getSorte(), SorteCartes.CARREAU);
		assertEquals(c7.getSorte(), SorteCartes.PIQUE);
		assertEquals(c8.getSorte(), SorteCartes.PIQUE);
		assertEquals(c9.getSorte(), SorteCartes.PIQUE);
		assertEquals(c10.getSorte(), SorteCartes.TREFLE);
		assertEquals(c11.getSorte(), SorteCartes.TREFLE);
		assertEquals(c12.getSorte(), SorteCartes.TREFLE);
		assertEquals(c13.getSorte(), SorteCartes.TREFLE);
	}

	@Test
	public void testGetSorteSymbole()
	{
		assertEquals(c1.getSorteSymbole(), '♥');
		assertEquals(c2.getSorteSymbole(), '♥');
		assertEquals(c3.getSorteSymbole(), '♥');
		assertEquals(c4.getSorteSymbole(), '\u2666');
		assertEquals(c5.getSorteSymbole(), '\u2666');
		assertEquals(c6.getSorteSymbole(), '\u2666');
		assertEquals(c7.getSorteSymbole(), '♠');
		assertEquals(c8.getSorteSymbole(), '♠');
		assertEquals(c9.getSorteSymbole(), '♠');
		assertEquals(c10.getSorteSymbole(), '♣');
		assertEquals(c11.getSorteSymbole(), '♣');
		assertEquals(c12.getSorteSymbole(), '♣');
		assertEquals(c13.getSorteSymbole(), '♣');
	}

	@Test
	public void testEstVisible()
	{
		assertEquals(c1.estVisible(), false);
		assertEquals(c2.estVisible(), false);
		assertEquals(c3.estVisible(), false);
		assertEquals(c4.estVisible(), false);
		assertEquals(c5.estVisible(), false);
		assertEquals(c6.estVisible(), false);
		assertEquals(c7.estVisible(), false);
		assertEquals(c8.estVisible(), false);
		assertEquals(c9.estVisible(), false);
		assertEquals(c10.estVisible(), false);
		assertEquals(c11.estVisible(), false);
		assertEquals(c12.estVisible(), false);
		assertEquals(c13.estVisible(), false);

	}

	@Test
	public void testSetVisible()
	{
		c1.setVisible(true);
		assertEquals(c1.estVisible(), true);
		c2.setVisible(true);
		assertEquals(c2.estVisible(), true);
		c3.setVisible(true);
		assertEquals(c3.estVisible(), true);
		c4.setVisible(true);
		assertEquals(c4.estVisible(), true);
		c5.setVisible(true);
		assertEquals(c5.estVisible(), true);
		c6.setVisible(true);
		assertEquals(c6.estVisible(), true);
		c7.setVisible(true);
		assertEquals(c7.estVisible(), true);
		c8.setVisible(true);
		assertEquals(c8.estVisible(), true);
		c9.setVisible(true);
		assertEquals(c9.estVisible(), true);
		c10.setVisible(true);
		assertEquals(c10.estVisible(), true);
		c11.setVisible(true);
		assertEquals(c11.estVisible(), true);
		c12.setVisible(true);
		assertEquals(c12.estVisible(), true);
		c13.setVisible(true);
		assertEquals(c13.estVisible(), true);

		c1.setVisible(false);
		assertEquals(c1.estVisible(), false);
		c2.setVisible(true);
		assertEquals(c2.estVisible(), true);
	}

	@Test
	public void testToStringCarte()
	{
		assertEquals(c1.toStringCarte(), "☺");

		c1.setVisible(true);
		assertEquals(c1.toStringCarte(), "A♥");
		c2.setVisible(true);
		assertEquals(c2.toStringCarte(), "2♥");
		c3.setVisible(true);
		assertEquals(c3.toStringCarte(), "3♥");
		c4.setVisible(true);
		assertEquals(c4.toStringCarte(), "4\u2666");
		c5.setVisible(true);
		assertEquals(c5.toStringCarte(), "5\u2666");
		c6.setVisible(true);
		assertEquals(c6.toStringCarte(), "6\u2666");
		c7.setVisible(true);
		assertEquals(c7.toStringCarte(), "7♠");
		c8.setVisible(true);
		assertEquals(c8.toStringCarte(), "8♠");
		c9.setVisible(true);
		assertEquals(c9.toStringCarte(), "9♠");
		c10.setVisible(true);
		assertEquals(c10.toStringCarte(), "10♣");
		c11.setVisible(true);
		assertEquals(c11.toStringCarte(), "J♣");
		c12.setVisible(true);
		assertEquals(c12.toStringCarte(), "Q♣");
		c13.setVisible(true);
		assertEquals(c13.toStringCarte(), "K♣");
	}

	@Test
	public void testEqualsObject()
	{
		Carte cTemp1 = new Carte(ValeurCartes.V_AS, SorteCartes.COEUR);
		Carte cTemp2 = new Carte(ValeurCartes.V_2, SorteCartes.COEUR);
		Carte cTemp3 = new Carte(ValeurCartes.V_AS, SorteCartes.CARREAU);

		assertTrue(c1.equals(cTemp1));

		assertFalse(c1.equals(null));
		assertFalse(c1.equals(new Integer(5)));
		assertFalse(c1.equals(cTemp2));
		assertFalse(c1.equals(cTemp3));
		assertFalse(c1.equals(c13));
	}

	@Test
	public void testCompareTo()
	{

		// Même valeur, même sorte
		Carte cTemp1 = new Carte(ValeurCartes.V_AS, SorteCartes.COEUR);
		assertTrue(c1.compareTo(cTemp1) == 0);

		// Même valeur, pas même sorte
		Carte cTemp2 = new Carte(ValeurCartes.V_2, SorteCartes.CARREAU);
		Carte cTemp3 = new Carte(ValeurCartes.V_2, SorteCartes.PIQUE);
		Carte cTemp4 = new Carte(ValeurCartes.V_2, SorteCartes.TREFLE);
		assertTrue(c2.compareTo(cTemp2) < 0);
		assertTrue(c2.compareTo(cTemp3) > 0);
		assertTrue(c2.compareTo(cTemp4) > 0);

		// Pas même valeur, même sorte
		Carte cTemp5 = new Carte(ValeurCartes.V_AS, SorteCartes.COEUR);
		Carte cTemp6 = new Carte(ValeurCartes.V_2, SorteCartes.COEUR);
		Carte cTemp7 = new Carte(ValeurCartes.V_6, SorteCartes.COEUR);
		Carte cTemp8 = new Carte(ValeurCartes.V_10, SorteCartes.COEUR);
		Carte cTemp9 = new Carte(ValeurCartes.V_JACK, SorteCartes.COEUR);
		Carte cTemp10 = new Carte(ValeurCartes.V_QUEEN, SorteCartes.COEUR);
		Carte cTemp11 = new Carte(ValeurCartes.V_KING, SorteCartes.COEUR);
		assertTrue(c3.compareTo(cTemp5) > 0);
		assertTrue(c3.compareTo(cTemp6) > 0);
		assertTrue(c3.compareTo(cTemp7) < 0);
		assertTrue(c3.compareTo(cTemp8) > 0);
		assertTrue(c3.compareTo(cTemp9) > 0);
		assertTrue(c3.compareTo(cTemp10) > 0);
		assertTrue(c3.compareTo(cTemp11) > 0);
		
		// Pas même valeur, pas même sorte
		assertTrue(c3.compareTo(c8) < 0);
		assertTrue(c3.compareTo(c6) < 0);
		assertTrue(c3.compareTo(cTemp2) > 0);
		assertTrue(c3.compareTo(c13) > 0);
	}

	@Test
	public void testToString()
	{
		assertEquals(c1.toString(), "A ♥");
		assertEquals(c2.toString(), "2 ♥");
		assertEquals(c3.toString(), "3 ♥");
		assertEquals(c4.toString(), "4 \u2666");
		assertEquals(c5.toString(), "5 \u2666");
		assertEquals(c6.toString(), "6 \u2666");
		assertEquals(c7.toString(), "7 ♠");
		assertEquals(c8.toString(), "8 ♠");
		assertEquals(c9.toString(), "9 ♠");
		assertEquals(c10.toString(), "10 ♣");
		assertEquals(c11.toString(), "J ♣");
		assertEquals(c12.toString(), "Q ♣");
		assertEquals(c13.toString(), "K ♣");
	}

}
