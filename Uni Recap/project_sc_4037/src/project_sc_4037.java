import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class project_sc_4037 {

	public static boolean isLetter(char ch) {
		
        
    public static boolean isSameLetterIgnoreCase(char ch1, char ch2) {
        
    public static String longestWord(String s) {

    }

    public static int countDifferentLetters(String s) {

        
    }

    public static char mostCommonLetter(String s) {
        
        s = s.toLowerCase();
        char[] letters = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);
        }

        int count = 0;
        int cur = 0;
        char letter = ' ';

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ' ') continue;  // Skip spaces
            
            count = 0;  // Reset count for each letter
    
            // Count occurrences of the current letter
            for (int j = 0; j < letters.length; j++) {
                if (letters[i] == letters[j]) {
                    count++;
                }
            }
    
            // If the current count is higher than the previous maximum count, update it
            if (count > cur) {
                cur = count;
                letter = letters[i];
            }
        }
        
        return letter;  // Return the most common letter
    }

    public static int countUniqueWords(String s) {

        s = s.toLowerCase();
        String[] words = s.split(" ");
        
        Arrays.sort(words);

        boolean isUnique = true;
        String word = " ";
        int singleCount = 0;
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            word = words[i];
            for(int j = 0; j < words.length; j++) {
                if (word != words[j]) {
                    break;
                } else 
                singleCount++;
            }
            if (singleCount != 1) {
                count++;
            }
        }

        return count;
    }



	public static void main(String[] args) {
		// Example usage
		System.out.println("\n" + isLetter('A')); // true
		System.out.println(isLetter('1')); // false

        System.out.println(isSameLetterIgnoreCase('A', 'a')); // true
		System.out.println(isSameLetterIgnoreCase('1', 'A')); // false

        System.out.println(longestWord(" 1 8"));
        System.out.println(countDifferentLetters("Hello there"));

        System.out.println(mostCommonLetter("Hello there"));
        System.out.println(countUniqueWords("A B A C A D"));
    }
}
