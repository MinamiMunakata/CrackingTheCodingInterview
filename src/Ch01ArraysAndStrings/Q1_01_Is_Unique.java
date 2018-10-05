/*
 *
 * Created by minami on 2018-10-03.
 * Copyright © 2018 Minami Munakata. All rights reserved.
 *
 */

package Ch01ArraysAndStrings;



import java.util.HashSet;
import java.util.Set;

public class Q1_01_Is_Unique {
    
//    TODO: Only allowed to use either ARRAY or STRING

    public static boolean isUniqueChars(String word) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            characterSet.add(word.charAt(i));
            if (characterSet.size() <= i) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }
    }


}
