import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class project_sc_4037 {

	public static boolean isLetter(char ch) {
		
        char c = Character.toUpperCase(ch);
        int num = c;
        
        if(num >= 65 && num <= 90)
            return true;
        else 
            return false;
	}

    public static boolean isSameLetterIgnoreCase(char ch1, char ch2) {
        char c1 = Character.toUpperCase(ch1);
        char c2 = Character.toUpperCase(ch2);

        if (c1 == c2)
            return true;
        else 
            return false;
    }

    public static String longestWord(String s) {

        String[] words = s.split(" ");
        String big = " ";
        int index = 0;

        int[] arr = new int[words.length];

        for(int i = 0; i < words.length; i++) {
            arr[i] = words[i].length();     
        }

        for(int i = 1; i < arr.length;i++ ) {
            if(arr[i] > arr[index]) {
                index = i;
            }
        }
        
        big = words[index];
        return big;
    }

    public static int countDifferentLetters(String s) {

        s = s.toLowerCase();
        char[] letters = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);
        }
        
        Arrays.sort(letters);
        int count = 0;
        char prev = 0; 

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ' ') continue; // skip spaces
            
            if (letters[i] != prev) {
                count++;
                prev = letters[i];
            }
        }
        
        return count;
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
        int count = 0;
        String prev = " "; 

        for (int i = 0; i < words.length; i++) {
            if (words[i] != prev) {
                count++;
                prev = words[i];
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
        System.out.println(countUniqueWords("This should be 4"));
    }
}
