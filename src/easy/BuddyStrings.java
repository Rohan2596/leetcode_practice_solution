package easy;


/**
 * ----------------------------------------
 * --------- Problem Statement ------------
 * ________________________________________
 * <p>
 * Given two strings s and goal,
 * return true if you can swap two letters in s so the result is equal to goal,
 * otherwise, return false.
 * <p>
 * Swapping letters is defined as taking
 * two indices i and j (0-indexed) such that i != j and
 * swapping the characters at s[i] and s[j].
 * <p>
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 * <p>
 * <p>
 * -------Example 1:------------
 * Input: s = "ab", goal = "ba"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
 * <p>
 * ---- Example 2:-------
 * Input: s = "ab", goal = "ab"
 * Output: false
 * Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
 * <p>
 * ---Example 3:--------
 * Input: s = "aa", goal = "aa"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, goal.length <= 2 * 104
 * s and goal consist of lowercase letters.
 */

public class BuddyStrings {

    public static void main(String[] args) {

        String s = "ab";
        String goal = "ab";
        char[] chars = s.toCharArray();
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 1; j < chars.length; j++) {
                if (i != j) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;

                    if (goal.equalsIgnoreCase(String.valueOf(chars))) {
                        System.out.println(true);
                        flag = true;
                        break;
                    }
                     temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }


    }

}
