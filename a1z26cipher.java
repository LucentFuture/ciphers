import java.util.ArrayList;

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
    ArrayList<Integer> alNum = new ArrayList<Integer>;
    String word = "";
    
    for(int i=0; i<ciphertext.length(); i++) {
      String num = ciphertext.charAt(i)+"";
      
      if(!(num.equals("-"))) {
        String next = ciphertext.charAt(i)+"";
        
        if(next.equals("-")) {
          alNum.add(Integer.parseInt(num));
        }
        else {
          alNum.add(Integer.parseInt(num+next));
          i++;
        }
      }
    }
    
    for(int j=0; j<alNum.size(); j++) {
      word+=alphabet[alNum.get(j)];
    }
    
    return word;
  }
}
