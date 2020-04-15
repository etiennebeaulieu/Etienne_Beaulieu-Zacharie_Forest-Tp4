package test;

import static org.junit.Assert.*;

import org.junit.*;

import structures.pile.NoeudPile;

//Étienne Beaulieu et Zacharie Forest
public class NoeudPileTest
{
	NoeudPile n1, n2, nPrecedent;
	Integer obj1, obj2, obj3;

	@Before
	public void testNoeudPileObject()
	{
		obj1 = new Integer(5);
		n1 = new NoeudPile(obj1);
	}

	@Before
	public void testNoeudPileObjectNoeudPile()
	{
		obj2 = new Integer(10);
		obj3 = new Integer(15);
		nPrecedent = new NoeudPile(obj2);
		n2 = new NoeudPile(obj3, nPrecedent);
	}

	@Test
	public void testGetElement()
	{
		assertEquals(n1.getElement(), obj1);
		assertEquals(n2.getElement(), obj3);
	}

	@Test
	public void testSetElement()
	{
		Object objTemp = new Object();
		NoeudPile nTemp = new NoeudPile(objTemp);
		n1.setElement(nTemp);
		assertEquals(n1.getElement(), nTemp);
	}

	@Test
	public void testGetPrecedent()
	{
		assertEquals(n1.getPrecedent(), null);
		assertEquals(n2.getPrecedent(), nPrecedent);
	}

	@Test
	public void testSetPrecedent()
	{
		n2.setPrecedent(n1);
		assertEquals(n2.getPrecedent(), n1);
		n1.setPrecedent(nPrecedent);
		assertEquals(n1.getPrecedent(), nPrecedent);
	}

}
