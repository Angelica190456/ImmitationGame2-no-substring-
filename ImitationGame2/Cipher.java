public class Cipher
{
   private String unCodedText = "";
   
   public Cipher(String text) {
       unCodedText = text;
   }
   
   public void ConvertCharacter() {
       for(int x = 0; x < unCodedText.length(); x++) {
           char Character = unCodedText.charAt(x);
           int ascii = (int) Character + 1;
           char newCharacter = (char) ascii;
           System.out.print(newCharacter);
       }
       System.out.println("");
   }
   
}  
