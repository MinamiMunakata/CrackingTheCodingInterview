package Ch01ArraysAndStrings;

/**
 * Created by minami_munakata on 2018-10-04.
 */
public class Q1_03_URLify {

    public static int findTrueLength(char[] arr) {
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] != ' ') return i + 1;
        }
        return -1;
    }

    public static String urlify(char[] arr, int trueLength) {
        char[] modified = new char[arr.length];
        for (int arr_i = 0, modified_j = 0; arr_i < trueLength; arr_i++, modified_j++) {
            if (arr[arr_i] != ' ') {
                modified[modified_j] = arr[arr_i];
            } else {
                modified[modified_j++] = '%';
                modified[modified_j++] = '2';
                modified[modified_j] = '0';
            }
        }
        return String.valueOf(modified);
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findTrueLength(arr);
        System.out.println("\"" + urlify(arr, trueLength) + "\"");
    }
}
