public class a1z26cipher() implements cipher {
  private String ciphertext;
  
  public a1z26cipher(String ciphertext) {
    this.ciphertext = ciphertext.toUpperCase();
  }
  
  /*
  Pre-requisite: A ciphertext must be inputed as a String (ex: 8-5-12-12-15)
  Post-requisite: No alterations to the ciphertext, returns a String with the decoded cipher in upper case
  */
  public String decoder(String ciphertext) {
    String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String word = "";
    
    for(int i=0; i<ciphertext.length(); i++) {
      String num = ciphertext.charAt(i)+"";
      
      if(i<ciphertext.length()-1) {
        String next = ciphertext.charAt(i)+"";

        if(num.equals("1") || num.equals("2")) {
          //check next.equals("-")
          //if next is a number, get said number
        }
        
        if(next.equals("-")) {
          //translate
          i++;
        }
      }
      else {
        String prev = ciphertext.charAt(i-1)+"";
        if(prev.equals("-")) {
          //get letter
        }
      }
      
      return word;
    }
  }
