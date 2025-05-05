import java.util.HashSet;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;

public class project_sc_4037 {
    
    // No Character Class
	public static boolean isLetter(char ch) {
        int ascii = (int) ch;
        if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
            return true;
        }
        return false;

    }

    // No Character Class   
    public static boolean isSameLetterIgnoreCase(char ch1, char ch2) {
        int fst = (int) ch1;
        int sec = (int) ch2;

        if (fst >= 65 && fst <= 90 ) {
            fst+=32;
        }

        if (sec >= 65 && sec <= 90) {
            sec+=32;
        }

        if (fst == sec) {
            return true;
        }
        return false;

    }
    
    public static String longestWord(String s) {
        String str = s.toLowerCase();
        String[] words = str.split(" ");
        String max = words[0];

        for (int i = 0; i < words.length;i++) {
            if (!words[i].matches("\\d+")) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }
            
        }
        return max; 
    }

    public static int countDifferentLetters(String s) {
        String str = s.toLowerCase().replace(" ", "");
        String[] letters = str.split("");
        
        Set <String> unique = new HashSet<>();

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != ("//d+")) {
                unique.add(letters[i]);
            }
        }
        return unique.size();
    }
    
    public static char mostCommonLetter (String s) {
        String str = s.toLowerCase().replace(" ", "");
        
        // First time using map
        Map<Character, Integer> counter = new HashMap<>();

        for (char c : str.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        char mostCommon = ' ';
        int max = 0;

        for(Map.Entry<Character, Integer> entry: counter.entrySet()) {
            if (entry.getValue() > max ) {
            max = entry.getValue();
            mostCommon = entry.getKey();
        }        
    }
    return mostCommon;
        
    }

    public static int countUniqueWords (String s){
        String str = s.toLowerCase();
        String[] words = str.split(" ");

        Set<String> unique = new HashSet<>();

        for(String i: words) {
            unique.add(i);
        }

        return unique.size();
    }

	public static void main(String[] args) {
		// Example usage
		System.out.println("\n" + isLetter('A')); // true
		System.out.println(isLetter('1')); // false

        System.out.println(isSameLetterIgnoreCase('Z', 'z')); // true
		System.out.println(isSameLetterIgnoreCase('1', 'A')); // false

        System.out.println(longestWord("hello there my number is 123456789 and my name is Allister")); // Allister
        System.out.println(countDifferentLetters("hello there")); // 6

        System.out.println(mostCommonLetter("hello there")); // 6
        System.out.println(countUniqueWords("A long long time ago, I can still remember..”")); // 6



    }
}
