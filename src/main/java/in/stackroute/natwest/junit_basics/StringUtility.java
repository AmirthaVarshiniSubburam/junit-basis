package in.stackroute.natwest.junit_basics;

public class StringUtility {
	public int getStringLength(String message) {
		if(message ==null || message.equals("")) {
			throw new NullPointerException();
		}
	
	return message.length();
	
}

public String concatStrings(StringUtility message1, String message2) {
	return message1+message2;
}

public boolean isStartWith(String messae,String startswith) {
	return message.startsWith(startswith);
}

public boolean stringContainsText(String message, String text) {
	return message.contains(text);
}

}