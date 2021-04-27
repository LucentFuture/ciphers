public class a1z26cipher() implements cipher {
  private String ciphertext;
  private int key;
  
  public a1z26cipher(String ciphertext, int key) {
    this.ciphertext = ciphertext.toUpperCase();
    this.key = key.toUpperCase();
  }
  
  /*
  Pre-requisite: A ciphertext and key must be inputed
  Post-requisite: No alterations to the ciphertext or key, returns a String with the decoded cipher in upper case
  */
  public String decoder(String ciphertext, int key) {
    
  }
