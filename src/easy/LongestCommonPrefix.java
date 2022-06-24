package easy;

/**
 * ---------------------------------------
 * ---- Problem Statement -------
 * --------------------------------------
 * <p>
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String shortest = strs[0];
        for (String value : strs) {
            if (shortest.length() > value.length()) {
                shortest = value;
            }
        }
        char[] chars = shortest.toCharArray();
        StringBuilder builder = new StringBuilder("");
        for (int j = 0; j < chars.length; j++) {
            boolean flag = true;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(j) == chars[j]) {
                    flag = true;

                }
                if (strs[i].charAt(j) != chars[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                builder.append(chars[j]);
            }
            if (!flag) {
                break;
            }
        }

        System.out.println(builder.toString());
    }
}

/**
 * ----------------------------
 * ---------- Results -----
 * -----------------------------
 *
 * Runtime: 1 ms, faster than 86.59% of Java online submissions for Longest Common Prefix.
 * Memory Usage: 41.7 MB, less than 75.88% of Java online submissions for Longest Common Prefix.
 *
 * */