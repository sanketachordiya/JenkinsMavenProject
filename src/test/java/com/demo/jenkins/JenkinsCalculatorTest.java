package com.demo.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCalculatorTest {
	
	@Test
	public void addTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		assertEquals(10, calc.add(5, 5));
	}
	
	@Test
	public void substractTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		assertEquals(10, calc.substract(15, 5));
	}

}
