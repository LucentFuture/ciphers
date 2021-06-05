public class ceasar {
  private String ciphertext;
  private int key;
	  
  /* prerequisite: all text should be upper case */
  public ceasar(String ciphertext, int key) {
    this.ciphertext = ciphertext.toUpperCase();
    this.key = key;
  }
	  
  /* prerequisite: A ciphertext and key must be inputed
  * post-requisite: No alterations to the ciphertext or key, returns a String with the decoded cipher in upper case */
  public String decoder(String ciphertext, int key) {
    String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    int shift = 25-key;
    String newWord = "";
	    
    for(int i=0; i<ciphertext.length(); i++) {
      String cLet = ciphertext.charAt(i)+"";

      int cIndx;
      int j=0;
      while(j<alphabet.length){
        if(alphabet[j].equals(cLet)) {
          cIndx = j;
          break;
        }
      }
    
      int newIndx = cIndx+key;

      while(newIndx>25) {
        newIndx-=25;
      }
      newWord+=alphabet[newIndx];
    }
    return newWord;
  }
}
