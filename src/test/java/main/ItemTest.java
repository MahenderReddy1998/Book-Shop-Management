package main;

import static org.junit.Assert.*;

import org.junit.Before;

import main.Cart;
import main.Item;

import org.junit.Test;

public class ItemTest {

	Item i;
	@Before
    public void setUp() throws Exception {
	 i = new Item();
	}
	String n;
	@Test
	public void itemTest() {
		
		 n = "testName";
		int mrp = 4535;
		i.addItem(n, mrp);
		
		
		assertEquals(mrp,i.getMrp());
		//fail("Not yet implemented");
	}
}
