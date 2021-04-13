import java.util.ArrayList;


public class vigenerecipher() implements cipher {
  private String ciphertext;
  private String key;
  
  public cingerecipher(String ciphertext, String key) {
    this.ciphertext = ciphertext;
    this.key = key;
  }
  
  /*
  Pre-requisite: A ciphertext and key must be inputted
  Post-requisite: No alterations to the ciphertext or key, returns a String with the decoded cipher
  */
  public String decoder(String ciphertext, String key) {
    String keyLC = key.toLowerCase();
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    
    int[] indexArr = new int[ciphertext.length()];
    for(int i=0; i<ciphertext.length(); i++) {
      String cLet = ciphertext.charAt(i)+"";
      int j=0;
      while(j<alphabet.length) {
        if(alphabet[j].equals(cLet)) {
          indexArr[i] = j;
          break;
        }
        j++;
      }
    }
    
    
  }
  
}
