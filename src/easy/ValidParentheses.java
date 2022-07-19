package easy;

import java.util.Stack;

/**
 * -------------------------------------
 * -------- Problem Statement -----
 * _____________________________________
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */


public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{";
        Stack<String> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            String parenthese = String.valueOf(ch);
            if (parenthese.equalsIgnoreCase("(") || parenthese.equalsIgnoreCase("[")
                    || parenthese.equalsIgnoreCase("{")) {
                stack.push(parenthese);
                continue;
            }
            if(parenthese.equalsIgnoreCase(")")){
                if (!stack.isEmpty() && stack.pop().equalsIgnoreCase("(")){

                }else{
                    stack.push(parenthese);
                }
            }
            if(parenthese.equalsIgnoreCase("]")){
                if (!stack.isEmpty() && stack.pop().equalsIgnoreCase("[")){

                }else{
                    stack.push(parenthese);
                }
            }
            if(parenthese.equalsIgnoreCase("}")){
                if (!stack.isEmpty() && stack.pop().equalsIgnoreCase("{")){

                }else{
                    stack.push(parenthese);
                }
            }

        }

        if (stack.isEmpty()) {
            System.out.println(true);
        }
        System.out.println(false);
    }
}
