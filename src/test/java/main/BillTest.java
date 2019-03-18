package main;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Cart;
import main.Item;
import main.BookShop;

public class BillTest {
/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF YOUR PROJECT !!!
 * 	
 */
	
	
	
	@SuppressWarnings("static-access")
	@Test
	public void billTest() {
		Cart c = new Cart();
		BookShop s = new BookShop();
		int t = 0;
		
		for(int i=0;i<2;i++){
            s.itemAvailable[i] = new Item();
        }
        s.itemAvailable[0].addItem("maggi", 24);
        s.itemAvailable[1].addItem("coffee", 100);
        c.updateCart(s.itemAvailable[0], 5);
        c.updateCart(s.itemAvailable[1], 6);
		
		
		 
		
		//not negative check
		//fail("Not yet implemented");
		 assertEquals(720,c.calcBill());
	}/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF YOUR PROJECT !!!
 * 	
 */
	
	
	@SuppressWarnings("static-access")
	@Test
	public void billTest2() {
		Cart c1 = new Cart();
		BookShop s = new BookShop();
		int t = 0;
		
		for(int i=0;i<2;i++){
            s.itemAvailable[i] = new Item();
        }
		s.itemAvailable[0].addItem("maggi", 40);
        s.itemAvailable[1].addItem("apple", 156);
        c1.updateCart(s.itemAvailable[0], 1);
        c1.updateCart(s.itemAvailable[1], 20);
      
	
		
		//not negative check
		
		//fail("Not yet implemented");
		 assertEquals(3160,c1.calcBill());
	}

}
