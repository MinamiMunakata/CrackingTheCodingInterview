package Ch01ArraysAndStrings;

/**
 * Created by minami_munakata on 2018-10-07.
 */
public class Q1_04_Palindrome_Permutation {

    public static int numOfLetter(char[] chars, char letter) {
        int count = 0;
        for (char c: chars) {
            if (c == letter) count++;
        }
        return count;
    }
    
    public static char[] myHashSet(char[] chars) {
        boolean[] myHashSetHelper = new boolean[128];
        int numOfDifferentLetter = 0;
        for (char c: chars) {
            if (!myHashSetHelper[c]) {
                myHashSetHelper[c] = true;
                numOfDifferentLetter++;
            }
        }
        char[] myHashSet = new char[numOfDifferentLetter];
        int i = 0;
        for (int j = 0; j < myHashSetHelper.length; j++) {
            if (myHashSetHelper[j]) {
                myHashSet[i] = (char) j;
                i++;
            }
        }
        return myHashSet;
    }

    public static boolean oneOrNoneOfLettersShowsUpOddTimes(char[] chars) {
        int count = 0;
        for (char c: myHashSet(chars)) {
            if (numOfLetter(chars, c) % 2 != 0) {
                count++;
                if (count > 1) return false;
            }
        }
        return true;
    }

    public static boolean isPermutationOfPalindrome(String string) {
        char withoutSpaceAndComma[] = string.toLowerCase().replace(" ", "").replace(",","").toCharArray();
        return oneOrNoneOfLettersShowsUpOddTimes(withoutSpaceAndComma);

    }

    public static void main(String[] args) {

        String[] strings = {"Rats live on no evil star",
                "A man, a plan, a canal, panama",
                "Lleve",
                "Tacotac",
                "asda",
                "minami",
                "asdfggfdsa",
                "asdf ,ghjkl, kjhgfdsa"};
        for (String s : strings) {
            boolean a = isPermutationOfPalindrome(s);
            System.out.print(String.format("%10s","Input: "));
            System.out.println(s);
            System.out.print(String.format("%10s","output: "));
            System.out.println(a);
            System.out.println();
        }
    }
}
