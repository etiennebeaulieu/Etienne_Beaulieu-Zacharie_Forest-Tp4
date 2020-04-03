package test;

import static org.junit.Assert.*;

import org.junit.*;

import structures.pile.NoeudPile;

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

//	@Test
//	public void testNoeudPileObjectInvalide()
//	{
//		fail("Not yet implemented");
//	}

	@Before
	public void testNoeudPileObjectNoeudPile()
	{
		obj2 = new Integer(10);
		obj3 = new Integer(15);
		nPrecedent = new NoeudPile(obj2);
		n2 = new NoeudPile(obj3, nPrecedent);
	}

//	@Test
//	public void testNoeudPileObjectNoeudPileInvalide()
//	{
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetElement()
	{
		AssertEqual((Integer)n1.getElement(), obj1);
	}

	@Test
	public void testSetElement()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrecedent()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetPrecedent()
	{
		fail("Not yet implemented");
	}

}
