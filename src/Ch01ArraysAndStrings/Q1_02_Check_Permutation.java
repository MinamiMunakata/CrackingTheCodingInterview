package Ch01ArraysAndStrings;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: minami_munakata
 * Date: 2018-10-04
 * Time: 7:10 PM
 */

public class Q1_02_Check_Permutation {

    public static boolean permutation(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] charA = a.toCharArray();
        Arrays.sort(charA);
        char[] charB = b.toCharArray();
        Arrays.sort(charB);
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] != charB[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}


