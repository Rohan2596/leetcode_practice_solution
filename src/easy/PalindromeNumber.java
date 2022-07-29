package easy;

import java.util.Iterator;
import java.util.Stack;

/**
 * Problem Statement
 * Given an integer x, return true if x is palindrome integer.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * For example, 121 is a palindrome while 123 is not.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */
public class PalindromeNumber {

    public static void main(String[] args) {
     int x= 10;
     Stack<Character> characterStack = new Stack<>();
     String value=String.valueOf(x);
        for (char ch:value.toCharArray()) {
            characterStack.push(ch);
        }
        StringBuilder builder= new StringBuilder("");
        Iterator iterator= characterStack.iterator();
        while (iterator.hasNext()){
            builder.append(characterStack.pop());
        }
        if(builder.toString().equalsIgnoreCase(value)){
            System.out.println(true);
        }
        System.out.println(false);
    }
}
