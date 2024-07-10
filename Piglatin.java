class Piglatin {

    // Function to check if a character is a vowel
    static boolean isVowel(char c) {
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    // Function to convert a string to Pig Latin
    static String pigLatin(String s) {
        int len = s.length();
        int index = -1;
        
        // Find the index of the first vowel
        for (int i = 0; i < len; i++) {
            if (isVowel(s.charAt(i))) {
                index = i;
                break;
            }
        }
        // Pig Latin is possible only if vowels are present
        if (index == -1)
            return "-1";

        // Form the Pig Latin string
        return s.substring(index) + s.substring(0, index) + "ay";
    }
    public static void main(String[] args) {
        String str = pigLatin("supernatiral");
        if (str.equals("-1")) {
            System.out.println("No vowels found. Pig Latin not possible");
        } else {
            System.out.println(str);
        }
    }
}
