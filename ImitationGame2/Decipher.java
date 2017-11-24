public class Decipher
{
    private String codedText = "";
    
    public Decipher(String decipherText) {
        codedText = decipherText;
    }
    
    public void decipherCode() {
        int x = 0;
        while(x < codedText.length()) {
            char decipheredCharacter = codedText.charAt(x);
            int ascii2 = (int) decipheredCharacter-1;
            char newCharacter2 = (char) ascii2; 
            System.out.print(newCharacter2);
            x++;
        }
        System.out.println("");
    }
    
}
