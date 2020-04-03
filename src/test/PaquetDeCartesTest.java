package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import cartes.*;
import exception.ConstructeurException;

import org.junit.*;

public class PaquetDeCartesTest
{
	PaquetDeCartes paquet1, paquet2;
	
	@Before
	public void testPaquetDeCartes()
	{
		paquet1 = new PaquetDeCartes();
	}


	@Before
	public void testPaquetDeCartesListOfCarte()
	{
		ArrayList<Carte> list = new ArrayList<Carte>();
		list.add(new Carte(ValeurCartes.V_AS, SorteCartes.PIQUE));
		list.add(new Carte(ValeurCartes.V_AS, SorteCartes.COEUR));
		list.add(new Carte(ValeurCartes.V_AS, SorteCartes.TREFLE));
		list.add(new Carte(ValeurCartes.V_AS, SorteCartes.CARREAU));
		list.add(new Carte(ValeurCartes.V_2, SorteCartes.PIQUE));
		list.add(new Carte(ValeurCartes.V_2, SorteCartes.COEUR));
		list.add(new Carte(ValeurCartes.V_2, SorteCartes.TREFLE));
		list.add(new Carte(ValeurCartes.V_2, SorteCartes.CARREAU));
		
		paquet2 = new PaquetDeCartes(list);
	}

	@Test
	public void testPaquetDeCartesListOfCarteInvalide()
	{
		try
		{
			new PaquetDeCartes(null);
			fail("Constructeur invalide");
		}
		catch (ConstructeurException e)
		{
		}
	}

	@Test
	public void testBrasser()
	{
		paquet1.brasser();
		PaquetDeCartes paquet3 = new PaquetDeCartes();
		double compteur = 0;
		
		for(int i = 0; i<paquet1.size(); i++)
		{
			if(!(paquet1.consulterCarte(i).equals(paquet3.consulterCarte(i))))
			{
				compteur++;
			}
		}
		assertTrue(compteur/52 >= 47/52);
		
	}

	@Test
	public void testConsulterCarte()
	{
		assertEquals(paquet2.consulterCarte(0),new Carte(ValeurCartes.V_AS, SorteCartes.PIQUE));
		assertEquals(paquet2.consulterCarte(1),new Carte(ValeurCartes.V_AS, SorteCartes.COEUR));
		assertEquals(paquet2.consulterCarte(2),new Carte(ValeurCartes.V_AS, SorteCartes.TREFLE));
		assertEquals(paquet2.consulterCarte(3),new Carte(ValeurCartes.V_AS, SorteCartes.CARREAU));
		assertEquals(paquet2.consulterCarte(4),new Carte(ValeurCartes.V_2, SorteCartes.PIQUE));
		assertEquals(paquet2.consulterCarte(5),new Carte(ValeurCartes.V_2, SorteCartes.COEUR));
		assertEquals(paquet2.consulterCarte(6),new Carte(ValeurCartes.V_2, SorteCartes.TREFLE));
		assertEquals(paquet2.consulterCarte(7),new Carte(ValeurCartes.V_2, SorteCartes.CARREAU));
		
		assertEquals(paquet1.consulterCarte(3),new Carte(ValeurCartes.V_4, SorteCartes.COEUR));
		assertEquals(paquet1.consulterCarte(9),new Carte(ValeurCartes.V_10, SorteCartes.COEUR));
		assertEquals(paquet1.consulterCarte(23),new Carte(ValeurCartes.V_JACK, SorteCartes.CARREAU));
		assertEquals(paquet1.consulterCarte(48),new Carte(ValeurCartes.V_10, SorteCartes.TREFLE));
	}

	@Test
	public void testPrendreCarte()
	{	
		assertEquals(paquet1.prendreCarte(-1), null);
		assertEquals(paquet1.prendreCarte(52), null);
		assertEquals(paquet1.prendreCarte(53), null);
		
		PaquetDeCartes paquet4 = new PaquetDeCartes();
		double compteur = 0;
		for(int i = 0; i<paquet4.size(); i++)
		{
			if(paquet1.prendreCarte(0).equals(paquet4.consulterCarte(i)))
			{
				compteur++;
			}
		}
		assertTrue(compteur/52 == 52/52);
		
	}

	@Test
	public void testRetournerToutesLesCartes()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSize()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty()
	{
		fail("Not yet implemented");
	}

}
