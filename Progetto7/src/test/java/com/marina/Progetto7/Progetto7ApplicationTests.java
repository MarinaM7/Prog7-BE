package com.marina.Progetto7;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import com.marina.Progetto7.models.Sonda;

@SpringBootTest
class Progetto7ApplicationTests {
	
	Sonda s1;
	Sonda s2;
	Sonda s3;
	
	List<Sonda> sonde;
	
	@Before
	public void setUp() {
		s1 = new Sonda ("45.4077172", "11.8734455", 5);
		s2 = new Sonda ("45.4074472", "09.8734455", 3);
		s3 = new Sonda ("33.4127172", "11.3356455", 8);
		
		sonde = new ArrayList<>() {{
			add(s1);
			add(s2);
			add(s3);
		}};
	}

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testProcesso() {
		
		
		
	}

}
