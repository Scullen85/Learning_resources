public class project_sc_4037 {

	public static boolean isLetter(char ch) {
		
        char c = Character.toUpperCase(ch);
        int num = c;
        
        //System.out.println(num);

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

        System.out.println(words);

        int[] arr

        for(int i = 0; i < words.length; i++) {

            int[] arr
           
        }
        return big;

    }


	public static void main(String[] args) {
		// Example usage
		System.out.println("\n" + isLetter('A')); // true
		System.out.println(isLetter('1')); // false

        System.out.println(isSameLetterIgnoreCase('A', 'a')); // true
		System.out.println(isSameLetterIgnoreCase('1', 'A')); // false

        System.out.println(longestWord("hello there my number is 123456789 and my name is Allister"));
    }
}
