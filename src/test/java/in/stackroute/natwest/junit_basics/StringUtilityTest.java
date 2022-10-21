package in.stackroute.natwest.junit_basics;

import static org.junit.Assert.assertEquals;

public class StringUtilityTest {

	StringUtitlity stringUtility 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testGetStringLength() {
		int length = stringUtility.getStringLength("Amirtha");
	assertEquals(6, length);
	}
	
	@Test(excepted = NullPointException.class)
	public void shouldThrowExceptionWhenCalledWithString() {
		stringUtility.getStringLength("");
	}
	@Test
	public void testConcatStrings() {
		String joinedString = stringUtility.concatString
	}
	
}
