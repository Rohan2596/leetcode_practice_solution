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
        String s = "ccc";
        char[] chars = s.toCharArray();
        int max=0;
        String maxString="";
        for (int i = 0; i < chars.length; i++) {
            StringBuilder builder = new StringBuilder("");
            builder.append(chars[i]);
            for (int j = i+1; j < chars.length; j++) {
                builder.append(chars[j]);
                String currentString= builder.toString();
                String reverseString=builder.reverse().toString();
                if(currentString.equals(reverseString)){
                    if(max<currentString.length()){
                        max=currentString.length();
                        maxString=currentString;
                    }
                }
                builder=new StringBuilder(currentString);
            }
            if(max==0){
                String currentString= builder.toString();
                String reverseString=builder.reverse().toString();
                if(currentString.equals(reverseString)){
                    if(max<currentString.length()){
                        max=currentString.length();
                        maxString=currentString;
                    }
                }
                builder=new StringBuilder(currentString);
            }
        }
        System.out.println(max);
    }
}
