package medium;

/**
 * ***************************************
 * ******* Problem Statement*******
 * ***************************************
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "nfpdmpi";
        char[] chars = s.toCharArray();
        int max=0;
        for (int i = 0; i < chars.length; i++) {
            StringBuilder builder = new StringBuilder("");
            builder.append(chars[i]);
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] != chars[j]) {
                    int value = builder.indexOf(String.valueOf(chars[j]));
                    if (value == -1) {
                        builder.append(chars[j]);
                    }
                    if (value >-1) {
                        break;
                    }
                }
                if (chars[i] == chars[j]) {
                    break;
                }
            }
            if(max<builder.length()){
                max=builder.length();
            }
        }
        System.out.println(max);
    }
}
