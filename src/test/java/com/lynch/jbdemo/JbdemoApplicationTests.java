package com.lynch.jbdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JbdemoApplicationTests {

	
	
	@Test
	void sayhi() {
		
		JbdemoApplication jbdemo = new JbdemoApplication();
		String actualResult = jbdemo.sayhi();
		assertEquals("Hi!!!", actualResult);
	}
	
	@Test
	void contextLoads() {
	}

}
