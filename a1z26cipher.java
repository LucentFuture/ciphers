public class a1z26 {
	private String message;
	
	public a1z26(String message) {
		this.message = message.toUpperCase();
	}
	
	/* prerequisite: A message (to be decoded) and key must be inputed
	 * post-requisite: No alterations to the message or key, returns a String with the decoded cipher in upper case */
	public String encoder() {
		String newmes = "";
		
		for(int i=0; i<message.length(); i++) {
	    	int let = (int)message.charAt(i);
	    	
	    	if(i!=0) {
	    		newmes+="-";
	    	}
	    	
	    	newmes+=(let-64);
	    }
		
		return newmes;
	}
}
