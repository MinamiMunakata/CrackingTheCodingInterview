package Ch01ArraysAndStrings;

/**
 * Created by minami_munakata on 2018-10-07.
 */
public class Q1_06_String_Compression {
    public static String compress(String str) {
        String compressed = "";
        int count = 0;
        if (str.length() > 0) compressed += str.substring(0, 1);
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (compressed.substring(j, j + 1).equals(str.substring(i, i + 1))) {
                count++;
            } else {
                compressed += count;
                count = 1;
                j = compressed.length();
                compressed += str.substring(i, i + 1);
            }
        }
        compressed += count;
        return (compressed.length() < str.length()) ? compressed : str;
    }

    public static void main(String[] args) {
        String[] tester = {"aaaaabbbbaaaabbddc", "a", "mmkkllc", "aaaaaaaaaabbbbbbbbbb"};
        for (String str: tester) {
            System.out.println(str);
            System.out.println(compress(str));
            System.out.println();
        }

    }
}
