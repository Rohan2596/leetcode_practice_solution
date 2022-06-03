package easy;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * *****************************************
 * ******** Problem Statement*********
 * *****************************************
 * <p>
 * You are given a positive integer num consisting only of digits 6 and 9.
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 * <p>
 * ---- Example 1:-----
 * Input: num = 9669
 * Output: 9969
 * Explanation:
 * Changing the first digit results in 6669.
 * Changing the second digit results in 9969.
 * Changing the third digit results in 9699.
 * Changing the fourth digit results in 9666.
 * The maximum number is 9969.
 * <p>
 * -----Example 2:--------
 * Input: num = 9996
 * Output: 9999
 * Explanation: Changing the last digit 6 to 9 results in the maximum number.
 * <p>
 * ----Example 3:----
 * Input: num = 9999
 * Output: 9999
 * Explanation: It is better not to apply any change.
 * <p>
 * --Constraints:---
 * 1 <= num <= 104
 * num consists of only 6 and 9 digits.
 **/
public class Maximum69Number {

    public static void main(String[] args) {

        int num = 9999;
        List<Integer> nums= new ArrayList<>();
        nums.add(num);
        char[] chars= String.valueOf(num).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='6'){
                chars[i]='9';
                nums.add(Integer.valueOf(String.valueOf(chars)));
                chars[i]='6';
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='9'){
                chars[i]='6';
                nums.add(Integer.valueOf(String.valueOf(chars)));
                chars[i]='9';
            }
        }

       int value= nums.stream().distinct().max(Integer::compare).get();
        System.out.println(value);

    }

}
