public class ClassPractice7String {
    public static void main(String[] args) {
        //test cases
        System.out.println(containsVowels("facetious")); // true
        System.out.println(containsVowels("abstemious")); // true
        System.out.println(containsVowels("regulation")); // false
        System.out.println(containsVowels("authorize")); // false
    }

    public static boolean containsVowels(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            if(countChar(str, vowel) != 1) {
                return false;
            }
        }

        int previousIndex = -1;
        for (char vowel : vowels) {
            int currentIndex = str.indexOf(vowel);
            if (currentIndex < previousIndex) {
                return false;
            }
            previousIndex = currentIndex;
        }
        return true;
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
