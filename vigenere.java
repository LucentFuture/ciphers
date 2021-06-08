package ciphers;
import java.util.ArrayList;

public class vigenere {
	private String message;
	private String key;
	
	public vigenere(String message, String key) {
		this.message = message;
		this.key = key;
	}
	
	/* prerequisite: A message (to be decoded) and key must be inputed
	 * post-requisite: No alterations to the message or key, returns a String with the decoded cipher in upper case */
	public String encoder() {
		ArrayList<Integer> keyarr = new ArrayList<Integer>();
		
		for(int j=0; j<key.length(); j++) {
			keyarr.add((int)key.charAt(j));
		}
		
		String newmes = "";
		int j=0;
		for(int i=0; i<message.length(); i++) {
	    		int let = (int)message.charAt(i);
	    	
			if(j==key.length()) {
				j -= key.length();
			}

			newmes+=Character.toString((char)(let+(keyarr.get(j)-64)));
			j++;
		}
		return newmes;
	}
}
