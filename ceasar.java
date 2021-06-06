public class ceasar {
	private String message;
	private int key;
	
	public ceasar(String message, int key) {
		this.message = message.toUpperCase();
		this.key = key;
	}
	
	/* prerequisite: A message (to be decoded) and key must be inputed
	* post-requisite: No alterations to the message or key, returns a String with the encoded message in upper case */
	public String encoder() {
		String newmes = "";
		for(int i=0; i<message.length(); i++) {
			int let = (int)message.charAt(i);
			newmes+=Character.toString((char)(let+key));
		}
		return newmes;
	}
	
	public String decoder() {
		String premes = "";
		for(int i=0; i<message.length(); i++) {
			int let = (int)message.charAt(i);
			premes+=Character.toString((char)(let-key));
		}
		return premes;
	}
}
