public class ceasarcipher() implements cipher {
  private String ciphertext;
  private String key;
  
  public ceasarcipher(String ciphertext, String key) {
    this.ciphertext = ciphertext.toUpperCase();
    this.key = key.toUpperCase();
  }
  
  /*
  Pre-requisite: A ciphertext and key must be inputed
  Post-requisite: No alterations to the ciphertext or key, returns a String with the decoded cipher in upper case
  */
  public String decoder(String ciphertext, String key) {
    
  }
}
