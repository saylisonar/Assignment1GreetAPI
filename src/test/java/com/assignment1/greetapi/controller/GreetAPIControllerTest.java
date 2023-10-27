/**
 * 
 */
package com.assignment1.greetapi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author sayali.sonar
 *
 */
class GreetAPIControllerTest {
	
	GreetAPIController controller;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new GreetAPIController();
	}

	/**
	 * Test method for {@link com.assignment1.greetapi.controller.GreetAPIController#greetAPI()}.
	 */
	@Test
	void testGreetAPI() {
		assertEquals("Hello World!!", controller.greetAPI());
	}

	/**
	 * Test method for {@link com.assignment1.greetapi.controller.GreetAPIController#greetAPIWithName(java.lang.String)}.
	 */
	@Test
	void testGreetAPIWithName() {
		assertEquals("Hello sayli!!", controller.greetAPIWithName("sayli"));
	}

}
