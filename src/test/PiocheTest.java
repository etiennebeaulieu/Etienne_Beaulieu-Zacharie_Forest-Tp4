package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import cartes.*;

import org.junit.*;

//Étienne Beaulieu et Zacharie Forest
public class PiocheTest
{
	PaquetDeCartes paquet1, paquet2;
	Pioche pioche1, pioche2, pioche3;

	@Before
	public void testPioche()
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

		paquet1 = new PaquetDeCartes(list);
		paquet2 = new PaquetDeCartes();

		pioche1 = new Pioche(paquet1);
		pioche2 = new Pioche(paquet2);
		pioche3 = new Pioche(null);
	}

	@Test
	public void testPiger()
	{
		assertEquals(pioche1.piger(),
				new Carte(ValeurCartes.V_AS, SorteCartes.PIQUE));
		assertEquals(pioche1.piger(),
				new Carte(ValeurCartes.V_AS, SorteCartes.COEUR));
		assertEquals(pioche1.piger(),
				new Carte(ValeurCartes.V_AS, SorteCartes.TREFLE));
		assertEquals(pioche1.piger(),
				new Carte(ValeurCartes.V_AS, SorteCartes.CARREAU));
		assertEquals(pioche1.piger(),
				new Carte(ValeurCartes.V_2, SorteCartes.PIQUE));
		assertEquals(pioche1.piger(),
				new Carte(ValeurCartes.V_2, SorteCartes.COEUR));
		assertEquals(pioche1.piger(),
				new Carte(ValeurCartes.V_2, SorteCartes.TREFLE));
		assertEquals(pioche1.piger(),
				new Carte(ValeurCartes.V_2, SorteCartes.CARREAU));

		assertEquals(pioche3.piger(), null);
	}

	@Test
	public void testConsulterDessus()
	{
		assertEquals(pioche1.consulterDessus(), "A ♠");
	}

	@Test
	public void testIsEmpty()
	{
		assertEquals(pioche1.isEmpty(), false);
		assertEquals(pioche2.isEmpty(), false);
		assertEquals(pioche3.isEmpty(), true);
	}

	@Test
	public void testSize()
	{
		assertEquals(pioche1.size(), 8);
		assertEquals(pioche2.size(), 52);
		assertEquals(pioche3.size(), 0);
		pioche2.consulterDessus();
		assertEquals(pioche2.size(), 52);
		pioche2.piger();
		assertEquals(pioche2.size(), 51);

	}

}
