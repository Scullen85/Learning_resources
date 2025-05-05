import java.util.HashSet;
import java.util.Set;
import java.util.zip.CRC32;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class project_sc_4037_PT2 {
    
    public static String ceaserEncrypt(String s, int shift) {
        char[] letters = s.toCharArray();
        char[] encrypted = new char[letters.length];

        for (int i = 0; i < letters.length;i++) {
            if (Character.isLetter(letters[i])) {  
                char base = Character.isUpperCase(letters[i]) ? 'A' : 'a';
                int cur = (letters[i] - base + shift) % 26;
                encrypted[i] = (char)(base + cur);
            } else {
                encrypted[i] = letters[i];
            }
        }  
        return new String(encrypted); 
    }
        
    public static String caesarDecrypted(String s, int shift) {
        char[] letters = s.toCharArray();
        char[] encrypted = new char[letters.length];

        for (int i = 0; i < letters.length;i++) {
            if (Character.isLetter(letters[i])) {  
                char base = Character.isUpperCase(letters[i]) ? 'A' : 'a';
                int cur = (letters[i] - base - shift + 26) % 26;
                encrypted[i] = (char) (base + cur);
            } else {
                encrypted[i] = letters[i];
            }
        }  
        return new String(encrypted); 
    }
    
    public static int countWordOccurances (String fileName, String S) {
        
    }
    


public static void main(String[] args) {
    
    System.out.println(ceaserEncrypt("He1llo World!", 3)); // Khoor Zruog!
    System.out.println(caesarDecrypted("Jgnnq vjgtg!", 2)); // Hello there!
}

}