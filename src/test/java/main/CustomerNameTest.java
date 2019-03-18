package main;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CustomerName;
public class CustomerNameTest {

	@Test
    public void customerTest() {
		
		CustomerName cn = new CustomerName();
		String test = "testnameCust";
		cn.setName(test);
		assertEquals(test,cn.getName());
		//	fail("Not yet implemented");
	}


}
