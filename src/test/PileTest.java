package test;

import static org.junit.Assert.*;

import org.junit.*;
import structures.pile.*;

public class PileTest
{
	Pile p1;

	@Before
	public void testPile()
	{
		p1 = new Pile();
	}

	@Test
	public void testEmpiler()
	{
		p1.empiler(new Integer(1));
		p1.empiler(new Integer(2));

		assertEquals(p1.getPremier(), new Integer(2));
		assertEquals(p1.depiler(), new Integer(2));
		assertEquals(p1.depiler(), new Integer(1));
	}

	@Test
	public void testDepiler()
	{
		p1.empiler(new Integer(1));
		p1.empiler(new Integer(2));

		assertEquals(p1.depiler(), new Integer(2));
		assertEquals(p1.depiler(), new Integer(1));
	}

	@Test
	public void testGetPremier()
	{
		p1.empiler(new Integer(1));
		p1.empiler(new Integer(2));

		assertEquals(p1.getPremier(), new Integer(2));
	}

	@Test
	public void testIsEmpty()
	{
		assertEquals(p1.isEmpty(), true);
		p1.empiler(new Integer(1));
		assertEquals(p1.isEmpty(), false);
	}

	@Test
	public void testVider()
	{

		p1.empiler(new Integer(1));
		p1.empiler(new Integer(2));
		p1.empiler(new Integer(1));
		p1.empiler(new Integer(2));
		p1.empiler(new Integer(1));
		p1.empiler(new Integer(2));

		p1.vider();
		assertEquals(p1.isEmpty(), true);
	}

	@Test
	public void testSize()
	{
		assertEquals(p1.size(), 0);

		p1.empiler(new Integer(1));
		p1.empiler(new Integer(2));
		assertEquals(p1.size(), 2);

		p1.empiler(new Integer(1));
		p1.empiler(new Integer(2));
		assertEquals(p1.size(), 4);

		p1.depiler();
		p1.depiler();
		assertEquals(p1.size(), 2);

		p1.vider();
		assertEquals(p1.size(), 0);

	}

	@Test
	public void testToString()
	{
		assertEquals(p1.toString(), "vide!\n");

		p1.empiler(new Integer(1));
		p1.empiler(new Integer(2));
		p1.empiler(new Integer(3));
		p1.empiler(new Integer(4));
		p1.empiler(new Integer(5));
		p1.empiler(new Integer(6));
		assertEquals(p1.toString(), "6\n5\n4\n3\n2\n1\n");
	}

}
