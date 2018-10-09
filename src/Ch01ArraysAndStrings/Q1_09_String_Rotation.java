package Ch01ArraysAndStrings;

/**
 * Created by minami_munakata on 2018-10-08.
 */
public class Q1_09_String_Rotation {

    /**
     * TODO: better to try again
     * Assume you have amethod isSubstring which checks ifone word is asubstring of another.
     * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1
     * using only one call to isSubstring (e.g.,"waterbottle"is a rotation of"erbottlewat").
     * @param s1
     * @param s2
     * @return
     */

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int endIndex = s2.length();
        while (!isSubstring(s1, s2.substring(0, endIndex))) {
            endIndex--;
        }
        return (s1.equals(s2.substring(endIndex) + s2.substring(0, endIndex)));
    }

    public static boolean isSubstring(String str, String substr) {
        if (str.length() < substr.length()) return false;
        int beginIndex = 0;
        while (beginIndex + substr.length() <= str.length()) {
            if (str.substring(beginIndex).equals(substr)) {
                return true;
            }
            beginIndex++;
        }
        return false;
    }

    public static void main(String[] args) {

        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"},
                            {"munakataminami","minamimunakata"}, {"kawaiikitty", "kittykawiii"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = isRotation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }
    }
}
