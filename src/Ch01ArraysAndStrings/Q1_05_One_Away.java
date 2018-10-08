package Ch01ArraysAndStrings;

/**
 * Created by minami_munakata on 2018-10-07.
 */
public class Q1_05_One_Away {
    public static final int TRUE = -1;
    public static final int FALSE = 0;

    public static boolean oneEditAway(String a, String b) {
        switch (a.length() - b.length()) {
            case 0: return oneIsReplaced(a.toCharArray(), b.toCharArray());
            case 1: return oneIsInsertedOrRemoved(a.toCharArray(), b.toCharArray());
            case -1: return oneIsInsertedOrRemoved(b.toCharArray(), a.toCharArray());
            default: return false;
        }
    }

    public static boolean oneIsReplaced(char[] a, char[] b) {
        boolean isReplaced = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (isReplaced) return false;
                else isReplaced = true;
            }
        }
        return true;
    }

    public static boolean oneIsInsertedOrRemoved(char[] longer, char[] shorter) {
        if (shorter.length == 0) return true;
        int isReplaced = FALSE;
        for (int i = 0; i < longer.length && (i + isReplaced) < shorter.length; i++) {
            if (longer[i] != shorter[i + isReplaced]) {
                if (isReplaced == TRUE) return false;
                else isReplaced = TRUE;
            }
        }
        return true;
    }

    public static void test(String a, String b, boolean expected) {
        if (oneEditAway(a, b) == expected) {
            System.out.println(a + ", " + b + "-> "+ oneEditAway(a, b));
        } else {
            System.out.println(a + ", " + b + "-> " + oneEditAway(a, b) + " <error!!>");
        }
    }

    public static void main(String[] args) {
        String[][] tests = {{"a", "b", "true"},
                {"", "d", "true"},
                {"d", "de", "true"},
                {"pale", "pse", "false"},
                {"acdsfdsfadsf", "acdsgdsfadsf", "true"},
                {"acdsfdsfadsf", "acdsfdfadsf", "true"},
                {"acdsfdsfadsf", "acdsfdsfads", "true"},
                {"acdsfdsfadsf", "cdsfdsfadsf", "true"},
                {"adfdsfadsf", "acdfdsfdsf", "false"},
                {"adfdsfadsf", "bdfdsfadsg", "false"},
                {"adfdsfadsf", "affdsfads", "false"},
                {"pale", "pkle", "true"},
                {"pkle", "pable", "false"},
                {"aaa", "aaaaaaa", "false"}};
        for (int i = 0; i < tests.length; i++) {
            String[] test = tests[i];
            String a = test[0];
            String b = test[1];
            boolean expected = test[2].equals("true");

            test(a, b, expected);
        }

    }
}
