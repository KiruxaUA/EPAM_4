package longestcommonsubsequence;

public class LongestCommonSubsequence {
    public static String getLongestCommonSubsequence(String str1, String str2) {

        int end = -1, maxLength = 0;
        int[][] matrix = new int[str1.length()][str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 1 + matrix[i - 1][j - 1];
                    }
                    if (maxLength < matrix[i][j]) {
                        maxLength = matrix[i][j];
                        end = i;
                    }
                }
            }
        }
        return str1.substring(end - maxLength + 1, end + 1);
    }
}
