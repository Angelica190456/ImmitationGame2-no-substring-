public class ImitationGame {
   public static void main() {
       Cipher myText = new Cipher("toilet");
       myText.ConvertCharacter();
       
       Decipher convertText = new Decipher("cpc");
       convertText.decipherCode();
   }
}

