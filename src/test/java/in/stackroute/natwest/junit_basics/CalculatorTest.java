package in.stackroute.natwest.junit_basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
//		AAA -> Arrange,Act and Assert
		//Act
		int res = calc.add(100,200);
		System.out.println("Test add method");
		//Assert
		assertEquals(300, res);
		
	}
	
	@After
	public void tearDown() {
		calc = null;
		System.out.println("After the test case");
	}
	
	@Test
	public void testSub() {
		int res = calc.sub(100,50);
		assertEquals(50, res);
	}

}
