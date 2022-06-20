package medium;

/***
 * -------------------------------------------------
 * ----------- Problem Statement -----------
 * _________________________________________________
 *
 * Given a string s, return the longest palindromic substring in s.
 *
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 *
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 *
 */


public class LongestPalindromicString {
    public static void main(String[] args) {
        String s = "aaca";
        char[] chars = s.toCharArray();
        int max = 0;
        String maxString = "";

        if (chars.length >= 2) {
            for (int i = 0; i < chars.length; i++) {
                StringBuilder builder = new StringBuilder("");
                builder.append(chars[i]);
                int j = i + 1;
                while (j < chars.length) {
                    if (chars[i] != chars[j]) {
                        builder.append(chars[j]);
                    }
                    if (chars[i] == chars[j]) {
                        builder.append(chars[j]);
                        String currentString = builder.toString();
                        String reverseString = new StringBuilder(builder).reverse().toString();
                        if (currentString.equals(reverseString)) {
                            if (max < reverseString.length()) {
                                max = reverseString.length();
                                maxString = reverseString;
                            }
                        }
                        builder = new StringBuilder(currentString);
                    }
                    j++;
                }
            }
            if (max == 0) {
                maxString = String.valueOf(chars[0]);
            }
        } else {
            maxString = s;
        }
        System.out.println(maxString);
    }
}
