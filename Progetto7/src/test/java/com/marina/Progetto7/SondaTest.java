package com.marina.Progetto7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.marina.Progetto7.models.Sonda;

public class SondaTest {

	Sonda s1;
	
	@Before
	public void setUp() {
		s1 = new Sonda ("45.4077172", "11.8734455", 3);
		
	}
	
	@Test
	public void testCheckFireLevel() {
		
		assertTrue(s1.getFireLevel() > 5);
		
		assertEquals(1, s1.checkFireLevel());
	
	}

}
