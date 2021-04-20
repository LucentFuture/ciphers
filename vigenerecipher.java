public class vigenerecipher() implements cipher {
  private String ciphertext;
  private String key;
  
  public vingerecipher(String ciphertext, String key) {
    this.ciphertext = ciphertext.toUpperCase();
    this.key = key.toUpperCase();
  }
  
  /*
  Pre-requisite: A ciphertext and key must be inputed
  Post-requisite: No alterations to the ciphertext or key, returns a String with the decoded cipher
  */
  public String decoder(String ciphertext, String key) {
    String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    int[] keyNum = new int[key.length()];
    
    for(int i=0; i<key.length(); i++) {
      String kLet = key.charAt(i)+"";
      int j=0;
      while(j<alphabet.length){
        if(alphabet[j].equals(kLet)) {
          keyNum[i] = j;
        }
        break;
      }
    }
    
    String newWord = "";
    for(int p=0; p<ciphertext.length(); p++) {
      String cLet = ciphertext.charAt(p)+"";
      
      int pIndx;
      int q=0;
      while(q<alphabet.length){
        if(alphabet[q].equals(cLet)) {
          pIndx = q;
        }
        break;
      }
      
      while(p>=key.length()) {
        p-=key.length();
      }
      int newIndx = pIndx+keyNum[p];
      
      if(newIndx>25) {
        newIndx-=25;
      }
      newWord+=alphabet[newIndx];
    }
    
    return newWord;
  }
  
}
