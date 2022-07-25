package medium;

import java.util.Stack;

/**
 * ****Problem Statement****
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 * <p>
 * Note that division between two integers should truncate toward zero.
 * <p>
 * It is guaranteed that the given RPN expression is always valid.
 * That means the expression would always evaluate to a result,
 * and there will not be any division by zero operation.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * Example 2:
 * <p>
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * Example 3:
 * <p>
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= tokens.length <= 104
 * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 */
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {

        String[] tokens = {"3", "11", "5", "+", "-"};
        Stack<Integer> temp = new Stack<>();
        for (String token : tokens) {

            if (token.equals("+") || token.equals("*")
                    || token.equals("/") || token.equals("-")) {

                if (!temp.isEmpty()) {
                    int value2 = temp.pop();
                    int value1 = temp.pop();
                    if (token.equals("+")) {
                        temp.push(value1 + value2);
                    }
                    if (token.equals("*")) {
                        temp.push(value1 * value2);
                    }
                    if (token.equals("/")) {
                        temp.push(value1 / value2);
                    }
                    if (token.equals("-")) {
                        temp.push(value1 - value2);
                    }
                }

            } else {
                temp.push(Integer.parseInt(token));
            }
        }
        if (!temp.isEmpty()) {
            System.out.println(temp.peek());

        }
    }
}
